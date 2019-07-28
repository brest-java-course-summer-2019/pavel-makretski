INSERT INTO sales_stage (sales_stage_id, sales_stage_name) VALUES (1, 'FIRST_CONTACT');
INSERT INTO sales_stage (sales_stage_id, sales_stage_name) VALUES (2, 'NEGOTIATION');
INSERT INTO sales_stage (sales_stage_id, sales_stage_name) VALUES (3, 'PRODUCTION');

INSERT INTO deal (deal_id, deal_date, client_name, budget, stage_id) VALUES (1, '2019-01-01', 'CLIENT_42', '4000', 1);
INSERT INTO deal (deal_id, deal_date, client_name, budget, stage_id) VALUES (2, '2019-02-02', 'CLIENT_43', '5000', 1);
INSERT INTO deal (deal_id, deal_date, client_name, budget, stage_id) VALUES (3, '2019-03-03', 'CLIENT_44', '6000', 2);
INSERT INTO deal (deal_id, deal_date, client_name, budget, stage_id) VALUES (4, '2019-04-04', 'CLIENT_45', '7000', 2);
INSERT INTO deal (deal_id, deal_date, client_name, budget, stage_id) VALUES (5, '2019-05-05', 'CLIENT_46', '3000', 2);