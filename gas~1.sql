CREATE TABLE billing
(billing_id number(10)NOT NULL,
consumer_id number(10)NOT NULL,
billing_bkdate varchar2(10)NOT NULL,
billing_deliverydate varchar2(10)NOT NULL,
billing_amt number(10)NOT NULL,
billling_noofcylinder number(2)NOT NULL,
CONSTRAINT billing_pk PRIMARY KEY (billing_id),
FOREIGN KEY (consumer_id) REFERENCES consumerinfo (consumer_id)
);