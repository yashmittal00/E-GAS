CREATE TABLE Llogin
(
LOGIN_lid number(10)NOT NULL,
LOGIN_Lpassword varchar2(10)NOT NULL,
LOGIN_Lfirstname varchar2(20)NOT NULL,
LOGIN_Llastname varchar2(20)NOT NULL,
LOGIN_Lemailid varchar2(20)NOT NULL,
LOGIN_Laddress varchar2(50)NOT NULL,
LOGIN_Lcontactno number(9)NOT NULL,
CONSTRAINT Llogin_pk PRIMARY KEY (LOGIN_lid)
);
