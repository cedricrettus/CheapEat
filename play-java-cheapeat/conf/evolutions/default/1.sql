

# --- !Ups

CREATE TABLE angebote(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  benutzer_id INTEGER,
  adressen_id INTEGER,
  titel VARCHAR(255) NOT NULL,
  beschreibung VARCHAR(255),
  kueche VARCHAR(255),
  datum DATE,
  zeit TIME,
  menge INTEGER,
  preis DOUBLE,
  FOREIGN KEY (benutzer_id) REFERENCES benutzer(id),
  FOREIGN KEY (adressen_id) REFERENCES adressen(id)
);

CREATE TABLE bilderangebote(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  angebote_id INTEGER,
  bilder_id INTEGER,
  FOREIGN KEY (angebote_id) REFERENCES angebote(id),
  FOREIGN KEY (bilder_id) REFERENCES bilder(id)
);

CREATE TABLE bilder(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  url VARCHAR(255) NOT NULL,
  beschreibung VARCHAR(255),
);

CREATE TABLE benutzer(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  nachname VARCHAR(255) NOT NULL,
  benutzername VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  bewertung INTEGER,
);

CREATE TABLE bestellungen(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  benutzer_id INTEGER,
  angebote_id INTEGER,
  menge INTEGER NOT NULL,
  prozesscode INTEGER NOT NULL,
  FOREIGN KEY (benutzer_id) REFERENCES benutzer(id),
  FOREIGN KEY (angebote_id) REFERENCES angebote(id)
);

CREATE TABLE adressen(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  strasse VARCHAR(255) NOT NULL,
  plz INTEGER NOT NULL,
  ort VARCHAR(255) NOT NULL,
  hausart VARCHAR(255) NOT NULL,
  stockwerk VARCHAR(255) NOT NULL,
);

CREATE TABLE benutzeradressen(
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  benutzer_id INTEGER,
  adressen_id INTEGER,
  FOREIGN KEY (adressen_id) REFERENCES adressen(id),
  FOREIGN KEY (benutzer_id) REFERENCES benutzer(id)
);


# --- !Downs

DROP table angebote;
DROP table benutzer;
DROP table benutzeradressen;
DROP table adressen;
DROP table bilder;
DROP table bilderangebote;
DROP table bestellungen;