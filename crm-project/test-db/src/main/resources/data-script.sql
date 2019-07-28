INSERT INTO sales_stage (sales_stage_id, sales_stage_name) VALUES (1, 'FIRST_CONTACT');
INSERT INTO sales_stage (sales_stage_id, sales_stage_name) VALUES (2, 'NEGOTIATION');
INSERT INTO sales_stage (sales_stage_id, sales_stage_name) VALUES (3, 'PRODUCTION');

INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, budget, stage_id) VALUES (1, '2019-01-01', 'USER42', 'FUSER 42', '4000', 1);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, budget, stage_id) VALUES (2, '2019-02-02', 'USER43', 'FUSER 43','5000', 1);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, budget, stage_id) VALUES (3, '2019-03-03', 'USER44', 'FUSER 44', '6000', 2);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, budget, stage_id) VALUES (4, '2019-04-04', 'USER45', 'FUSER 45','7000', 2);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, budget, stage_id) VALUES (5, '2019-05-05', 'USER46', 'FUSER 46','3000', 2);