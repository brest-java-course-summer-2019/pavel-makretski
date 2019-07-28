DROP TABLE IF EXISTS sales_stage;
CREATE TABLE sales_stage (
  sales_stage_id INT NOT NULL AUTO_INCREMENT,
  sales_stage_name VARCHAR(255) NOT NULL UNIQUE,
  PRIMARY KEY (sales_stage_id)
);

DROP TABLE IF EXISTS deals;
CREATE TABLE deals (
  deal_id INT NOT NULL AUTO_INCREMENT,
  deal_date DATE NOT NULL,
  client_name VARCHAR(255) NOT NULL,
  budget INT NOT NULL,
  sales_stage_id int NOT NULL,
  PRIMARY KEY (deal_id),
  FOREIGN KEY (sales_stage_id) REFERENCES sales_stage (sales_stage_id)
);

