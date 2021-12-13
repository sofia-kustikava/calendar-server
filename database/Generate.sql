CREATE TABLE Event
(
    id bigint NOT NULL PRIMARY KEY,
    name varchar(70) NOT NULL,
    description varchar(255) NOT NULL,
    dates date
);