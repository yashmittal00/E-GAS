CREATE TABLE transaction
(t_id number(10)NOT NULL,
consumer_id number(10)NOT NULL,
t_cylintype varchar2(10)NOT NULL,
CONSTRAINT transaction_pk PRIMARY KEY(t_id)
);