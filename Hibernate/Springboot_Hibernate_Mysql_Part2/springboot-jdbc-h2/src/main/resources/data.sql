create table person(
id integer not null,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10001,'Brijesh','Bangalore',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10002,'Mohan','Hyderabad',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10003,'John','Boston',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10004,'Mary','Boston',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10005,'Robert','Boston',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10006,'Lilo','Boston',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10007,'Lilo','Kentucky',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10008,'Lilo','Iowa',sysdate());
INSERT INTO PERSON
    (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10009,'Lilo','Maine',sysdate());