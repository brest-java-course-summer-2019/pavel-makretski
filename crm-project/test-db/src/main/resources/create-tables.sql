DROP TABLE IF EXISTS stage;
CREATE TABLE stage
(
    sales_stage_id   INT          NOT NULL AUTO_INCREMENT,
    sales_stage_name VARCHAR(255) NOT NULL UNIQUE,
    PRIMARY KEY (sales_stage_id)
);

DROP TABLE IF EXISTS deal;
CREATE TABLE deal
(
    deal_id           INT          NOT NULL UNIQUE AUTO_INCREMENT,
    deal_date         DATE         NOT NULL,
    client_first_name VARCHAR(255) NOT NULL,
    client_last_name  VARCHAR(255) NOT NULL,
    budget            INT          NOT NULL,
    sales_stage_id    int          NOT NULL,
    PRIMARY KEY (deal_id),
    FOREIGN KEY (sales_stage_id) REFERENCES stage (sales_stage_id)
);

