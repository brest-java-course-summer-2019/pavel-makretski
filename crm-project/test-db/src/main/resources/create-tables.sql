DROP TABLE IF EXISTS stage;
CREATE TABLE stage (
  stage_id INT NOT NULL AUTO_INCREMENT,
  stage_name VARCHAR(255) NOT NULL UNIQUE,
  PRIMARY KEY (stage_id)
);

DROP TABLE IF EXISTS deals;
CREATE TABLE deals (
  deal_id INT NOT NULL AUTO_INCREMENT,
  deal_date DATE NOT NULL,
  client_name VARCHAR(255) NOT NULL,
  budget INT NOT NULL,
  department_id INT NOT NULL,
  stage_id int NOT NULL,
  PRIMARY KEY (deal_id),
  FOREIGN KEY (stage_id) REFERENCES stage (stage_id)
);

