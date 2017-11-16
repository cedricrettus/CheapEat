
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object upload_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class upload extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("CheapEat - Image Upload")/*2.33*/{_display_(Seq[Any](format.raw/*2.34*/("""

    """),format.raw/*4.5*/("""<script src="/assets/js/fileUpload.js"></script>

    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading"><strong>Upload Files</strong> <small>Bootstrap files upload</small></div>
            <div class="panel-body">

                    <!-- Standard Form -->
                <h4>Select files from your computer</h4>
                <form action="" method="post" enctype="multipart/form-data" id="js-upload-form">
                    <div class="form-inline">
                        <div class="form-group">
                            <input type="file" name="files[]" id="js-upload-files" multiple>
                        </div>
                        <button type="submit" class="btn btn-sm btn-primary" id="js-upload-submit">Upload files</button>
                    </div>
                </form>

                    <!-- Drop Zone -->
                <h4>Or drag and drop files below</h4>
                <div class="upload-drop-zone" id="drop-zone">
                    Just drag and drop files here
                </div>

                    <!-- Progress Bar -->
                <div class="progress">
                    <div class="progress-bar" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
                        <span class="sr-only">60% Complete</span>
                    </div>
                </div>

                    <!-- Upload Finished -->
                <div class="js-upload-finished">
                    <h3>Processed files</h3>
                    <div class="list-group">
                        <a href="#" class="list-group-item list-group-item-success"><span class="badge alert-success pull-right">Success</span>image-01.jpg</a>
                        <a href="#" class="list-group-item list-group-item-success"><span class="badge alert-success pull-right">Success</span>image-02.jpg</a>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- /container -->
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object upload extends upload_Scope0.upload
              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 09:07:17 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/upload.scala.html
                  HASH: 4304769a6fe80dcb95ebe3c55fe557cef6ab1664
                  MATRIX: 829->3|868->34|906->35|940->43
                  LINES: 32->2|32->2|32->2|34->4
                  -- GENERATED --
              */
          