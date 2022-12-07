-- 데이터베이스 생성
create database shop;
commit;

-- 데이터베이스 선택
use shop;

create table board(bno int primary key auto_increment, title varchar(200) not null,
	content varchar(1000) not null, author varchar(20) not null, resDate datetime default now()
    );
    
desc board;

insert into board(title, content, author) values ("테스트 제목 1", "테스트1 내용입니다.", "admin");
insert into board(title, content, author) values ("테스트 제목 2", "테스트2 내용입니다.", "admin");

create table sample(id varchar(100) not null, pw varchar(1000) not null);

insert into sample(id, pw) values("test", "1234");

select * from sample;

create table member(id varchar(200) primary key, email varchar(200) not null,
	password varchar(500) not null, createdDate varchar(100) , modifiedDate varchar(100)
    );
    
insert into memeber(id, email, password) values("admin","email@email.com","1234");

commit;
select * from sample;

select * from board;

