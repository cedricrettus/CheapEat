# Cheapeat Webapplikation

# Description
Cheapeat is a web application to sell and buy unnused food. You can create an offer with your food and a picture. Users can filter offers by plz and date. 

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
 
 # Usage
 ## REST API
 The application comes with a REST API, that can be used to get offers, ratings, users, orders and to post Registration, login, offer    creation, ratings and order request. ALl URLs with parameters are listed below. Parameter type is string if not specified
 
 GET  /               Response: Index site as html
 
 GET  /angebote/all   Response: 15 random offers are returned as JSON, only available offers
 
 GET  /angebote/:id   Response: Offer with selected id is returned as JSON
 
 GET  /search         Response: search site is returned as html
 
 GET  /search/:plz    Parameters: optinoal parameter "datum", returns offers on selected date
                      Response: Offers as JSON with selected plz and date (optional)
                      
 GET  /signup         Response: signup form as html
 
 POST /signup         Registers a new user
                      Parameters: "name" : name of the user
                                  
 
 secured functions: to use these function you have to be logged in as 
 
 POST  /angebote      creates a new offer
                      Parameters: "titel" : title of the offer
                                  "beschreibung" : description of the offer
                                  "datum" : date when the offer is to be picked up format yy-mm-dd
                                  "zeitForm" : time when the offer is to be picked up format hh:mm
                                  "kueche" : kitchen e.g. italian, french
                                  "menge" : the number of available servings (int)
                                  "preis" : the price per serving (double)
                                  "bilder[]" : image/jpeg binary
                      Response:   OK if offer is successfully created
                                  bad request with errortext
                                  
 POST  /bestellung    creates an order for the specified offer
                      Parameter:  "menge" : servings to be placed on order (int)
                                  "id"    : offer id (int)
                                  OK if order is successfully created
                                  bad request with errortext
                                  
 POST
 
 
 # Authors
 Authors of this project are Fabio Göldi and Cedric Sutter
 Contact: fabio.goeldi@ntb.ch; cedric.sutter@ntb.ch
 
 
 
