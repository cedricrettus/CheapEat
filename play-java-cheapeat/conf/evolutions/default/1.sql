

# --- !Ups

CREATE TABLE angebote(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  titel VARCHAR(255) NOT NULL,
  beschreibung VARCHAR(255),
  kueche VARCHAR(255),
  datum DATE,
  zeit TIME,
  menge INTEGER,
  preis DOUBLE
);

# --- !Downs

DROP table angebote;