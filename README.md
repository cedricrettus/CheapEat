# Cheapeat Webapplikation

# Description
Cheapeat is a web application to sell and buy unnused food. You can create an offer with your food and a picture. Users can filter offers by plz and date. 

The application is based on the java play framework version 2.5.3

Frameworks/modules used:
 - [play framework 2.5.1](https://www.playframework.com/documentation/2.5.x/Highlights25)
 - [Bootstrap 4.0.0-beta2](https://getbootstrap.com/docs/4.0/getting-started/introduction/)
 - [jQuery 3.2.1](http://api.jquery.com/)
 - [hibernate 4.3.7](http://hibernate.org/orm/documentation/4.3/)
 - [play-mailer 6.0.1](https://github.com/playframework/play-mailer)
 - [jbcrypt](http://www.mindrot.org/projects/jBCrypt/)
 - [aws-java-sdk 1.11.229](http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html)
 

## Concepts used in this Application
  - User Management
  - User Registration with confirmation through email
  - User login after confirmation
  - File upload to Amazon S3 bucket
  - Create Offer with multiple pictures
  - Order offer
  - Accept or deny an order request for your offer
  - Rate users after order completion
  - Show user ratings
  - Send emails via play-mailer and google smtp
 
 # Usage
 ## REST API
 The application comes with a REST API, that can be used to get offers, ratings, users, orders and to post registration, login, offer    creation, ratings and order request. All URLs with parameters are listed below. Parameter type is string if not specified
 
```
 GET  /  
```
 - Response: Index site as html
 
```
 GET  /angebote/all  
```
  - Response: 15 random offers are returned as JSON, only available offers
 ```
 GET  /angebote/:id 
 ```
  - Response: Offer with selected id is returned as JSON
 
 ```
 GET  /search
 ```
  - Response: search site is returned as html
 
 ```
 GET  /search/:plz    
 ```
  - Parameters: optinoal parameter "datum", returns offers on selected date
  - Response: Offers as JSON with selected plz and date (optional)
  
   ```
 GET  /benutzer/:id/bewertung  
 ```
  - Returns rating points of specified user
  - Response: rating as JSON
  
   ```
 GET  /login    
 ```
  - response: login form as html
  
   ```
 POST  /login   
 ```
  - parameter:
    - "email" : email of the registered user
    - "passwort" : password of the registered user
  - response: OK if offer is successfully created (session cookie is created), bad request with errortext
  
 ```
 GET  /signup 
 ```
  - Response: signup form as html
 
 ```
 POST /signup
 ```
  - Registers a new user
  - Parameters: 
    - "name" : name of the user
    - "benutzername" : username, has to be unique
    - "email" : email adress, has to be unique
    - "passwort" : password
    - "plz" : zipcode (int)
    - "strasse" : street
    - "ort" : residence
  - response: OK if user is successfully created, bad request with errortext
  
  ```
  GET  /confirm/:confirmToken
  ```
   - validates the user with given confirmation token, confirmation token is in format of a UUID
   - response: OK if offer is successfully created (session cookie is created), bad request with errortext
                                  
 
 **secured functions**: to use these function you have to be logged in
 
 ```
 POST  /angebote
 ```
  - creates a new offer
  - Parameter: 
     - "titel" : title of the offer
     - "beschreibung" : description of the offer
     - "datum" : date when the offer is to be picked up format yy-mm-dd
     - "zeitForm" : time when the offer is to be picked up format hh:mm
     - "kueche" : kitchen e.g. italian, french
     - "menge" : the number of available servings (int)
     - "preis" : the price per serving (double)
     - "bilder[]" : image/jpeg binary
   - Response:   OK if offer is successfully created, bad request with errortext
 ```                               
 POST  /bestellung 
 ```
  - creates an order for the specified offer
  - Parameter:  
     - "menge" : servings to be placed on order (int)
     - "id"    : offer id (int)
  - response: OK if order is successfully created, bad request with errortext
 
 ```                                
 GET  /logout
 ```
  - logs off the user, destroys the play session
  - response:   OK if offer is successfully created, bad request with errortext
  
 ```
 POST  /bestellung/:id/bewertung
 ```
  - rates the specified order (by order id)
  - parameters
    - "who" : "anbieter" or "besteller" specifies the seller/buyer
    - "token" : token to authorise the rating
    - "rating" : rating point for the user (int, 1 to 5)
  - response :  OK if offer is successfully created, bad request with errortext
  
 ```
 GET  /me/bestellungen
 ```
  - response: all placed order of signed in user as JSON
  
  ```
 GET  /me/anfragen
 ```
  - response: all order requests offsigned in user as JSON
  
  ```
 GET  /me/angebote
 ```
  - response: all created offers of signed in user as JSON
  
  ```
 GET  /me/anfragen/:id/accept
 ```
  - accepts the specified order request (parameter is order id)
  - response: OK if offer is successfully created, bad request with errortext
  
```
 GET  /me/anfragen/:id/deny
 ```
  - denys the specified order request (parameter is order id)
  - response: OK if offer is successfully created, bad request with errortext
  
 ## Config options
 To deploy the application the mysql database url, s3 bucket and the smtp server have to be set.
 The configuration for the play app is in /conf/application.conf
 
 The following configurations need to be adjusted:
 
 ```
 db.default{
  driver="com.mysql.jdbc.Driver"
  url="jdbc:mysql://<mysql_url>"
  username=<mysql_username>
  password="<mysql_password>"
  host="<hostname>"
  jndiName=DefaultDS
}
```

```
//alternative smtp server can be used, example is with google smtp with tls
play.mailer {
  debug = true
  host = "smtp.gmail.com" 
  port = 587
  ssl = false
  tls = true
  user = "<username (email)>"
  password = "<password>"
  timeout=60000
  connectiontimeout=60000
  //https://myaccount.google.com/u/3/lesssecureapps zulassen
}

```

```
aws.accessKey="<access_key>"
aws.secretKey="<secret_key>"
cheapeat.s3.bucketName="<s3_bucket_name>"
```

```
//site hostname for urls building
server.hostname = "<hostname url>"
```
  
 # Future developments
 The following futures should be developed to deploy the application is deployed in a productive environment
  - Users should be able to reset password (via forget password or password change)
  - Users should be able to update addresses
  - Users should be able to add additional addresses and add different addresses to offers
  - Images should be saved as thumnails, be shown full size when clicked on thumbnail
  - Users should be able to edit and delete created offers
 
 # Authors
 Authors of this project are Fabio Göldi and Cedric Sutter
 Contact: fabio.goeldi@ntb.ch; cedric.sutter@ntb.ch
 
 
 
