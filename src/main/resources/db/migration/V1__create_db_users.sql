create table users
(
    id          int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    login       varchar   not null unique
);