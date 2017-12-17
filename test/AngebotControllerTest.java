import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.annotations.VisibleForTesting;
import controllers.routes;
import jdk.nashorn.internal.runtime.ECMAException;
import models.Angebot;
import org.junit.*;

import org.junit.runners.MethodSorters;
import play.Application;
import play.Mode;
import play.db.jpa.Transactional;
import play.inject.guice.GuiceApplicationBuilder;
import play.libs.Json;
import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.Mode.TEST;
import static play.mvc.Results.status;
import static play.test.Helpers.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import play.Mode;

/**
*
*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AngebotControllerTest {

    protected Application application;

    @Before
    public void startApp() throws Exception {
        ClassLoader classLoader = FakeApplication.class.getClassLoader();
        application = new GuiceApplicationBuilder().in(classLoader).build();
        Helpers.start(application);
    }

    @Test
    public void alogin() throws Exception {
        ObjectNode loginRequest = Json.newObject();
        loginRequest.put("email", "test@test.ch");
        loginRequest.put("passwort", "test1234");

        Http.RequestBuilder request = new Http.RequestBuilder().method("POST")
                .bodyJson(loginRequest)
                .uri(controllers.routes.Authentication.authenticate().url());
        Result result = route(request);

        assertEquals(OK, result.status());

    }

    @Test
    public void createOffer() throws Exception {
        //Zuerst einloggen, damit das Angebot erstellt werden kann
        ObjectNode loginRequest = Json.newObject();
        loginRequest.put("email", "test@test.ch");
        loginRequest.put("passwort", "test1234");

        Http.RequestBuilder request = new Http.RequestBuilder().method("POST")
                .bodyJson(loginRequest)
                .uri(controllers.routes.Authentication.authenticate().url());
        Result result = route(request);

        assertEquals(OK, result.status());

        Http.Cookie cookieAuthenticated = result.cookie("PLAY_SESSION");

        ObjectNode createRequest = Json.newObject();

        createRequest.put("titel", "Testtitel 456123812354");
        createRequest.put("beschreibung", "eine testbeschreibung für das Testangebot");
        createRequest.put("zeitForm", "14:33");
        createRequest.put("datum", "2017-12-14");
        createRequest.put("kueche", "italienisch");
        createRequest.put("menge", 13);
        createRequest.put("preis", 1.9);

        request.bodyJson(createRequest)
                .uri(controllers.routes.AngebotController.addOffer().url())
                .cookie(cookieAuthenticated);
        Result resultOffer = route(request);

        assertEquals(OK, resultOffer.status());


    }

    @After
    public void stopApp() throws Exception {
        Helpers.stop(application);
    }


}
