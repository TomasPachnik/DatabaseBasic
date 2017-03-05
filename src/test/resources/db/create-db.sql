CREATE TABLE Excercise (
    uuid VARCHAR(36) PRIMARY KEY,
    level integer,
    name varchar(50) not null,
    repetations integer,
    series integer,
    timestamp bigint
);