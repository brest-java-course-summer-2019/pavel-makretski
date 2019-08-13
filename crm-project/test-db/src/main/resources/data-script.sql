INSERT INTO stage (sales_stage_id, sales_stage_name, sales_stage_deals, sales_stage_budget)
VALUES (1, 'PRIMARY', 5, 4201);
INSERT INTO stage (sales_stage_id, sales_stage_name, sales_stage_deals, sales_stage_budget)
VALUES (2, 'CONVERSATION', 6, 4202);
INSERT INTO stage (sales_stage_id, sales_stage_name, sales_stage_deals, sales_stage_budget)
VALUES (3, 'NEGOTIATION', 7, 4203);
INSERT INTO stage (sales_stage_id, sales_stage_name, sales_stage_deals, sales_stage_budget)
VALUES (4, 'PRODUCTION', 8, 4204);

INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, deal_budget, sales_stage_id)
VALUES (1, '2019-01-01', 'USER42', 'FUSER 42', '4000', 1);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, deal_budget, sales_stage_id)
VALUES (2, '2019-02-02', 'USER43', 'FUSER 43', '5000', 2);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, deal_budget, sales_stage_id)
VALUES (3, '2019-03-03', 'USER44', 'FUSER 44', '6000', 3);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, deal_budget, sales_stage_id)
VALUES (4, '2019-04-04', 'USER45', 'FUSER 45', '7000', 4);
INSERT INTO deal (deal_id, deal_date, client_first_name, client_last_name, deal_budget, sales_stage_id)
VALUES (5, '2019-05-05', 'USER46', 'FUSER 46', '3000', 2);