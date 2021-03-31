CREATE TABLE location(
    location_id INTEGER NOT NULL AUTO_INCREMENT,
    city VARCHAR(200) NOT NULL,
    state VARCHAR(50) NOT NULL,
    zipcode VARCHAR(20) NOT NULL,
    PRIMARY KEY (location_id)
);

INSERT INTO location (city, state, zipcode) VALUES ('Dallas', 'tx', '75010');
INSERT INTO location (city, state, zipcode) VALUES ('Madison', 'WI', '53704');

