create table user (
	id varchar(100) primary key,
	userName varchar(20) not null , 
	password varchar(20) not null,
	email varchar(50) not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;