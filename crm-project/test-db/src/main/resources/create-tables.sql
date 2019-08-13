DROP TABLE IF EXISTS stage;
CREATE TABLE stage
(
    sales_stage_id      INT          NOT NULL,
    sales_stage_name    VARCHAR(255) NOT NULL,
    sales_stage_deals   INT          NOT NULL,
    sales_stage_budget  INT          NOT NULL,
    PRIMARY KEY (sales_stage_id)
);

DROP TABLE IF EXISTS deal;
CREATE TABLE deal
(
    deal_id             INT          NOT NULL,
    deal_date           DATE         NOT NULL,
    client_first_name   VARCHAR(255) NOT NULL,
    client_last_name    VARCHAR(255) NOT NULL,
    deal_budget         INT          NOT NULL,
    sales_stage_id      INT          NOT NULL,
    PRIMARY KEY (deal_id),
    FOREIGN KEY (sales_stage_id) REFERENCES stage(sales_stage_id)
);

