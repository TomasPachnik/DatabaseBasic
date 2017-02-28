CREATE TABLE identity (
  uuid VARCHAR(36) PRIMARY KEY ,
  name VARCHAR(50),
  surname VARCHAR(50),
  login VARCHAR(50),
  enabled BOOLEAN,
  email VARCHAR(256),
  encodedPassword VARCHAR(256),
  age INTEGER
);
