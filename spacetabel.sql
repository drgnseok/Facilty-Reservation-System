drop table space;

#학번, 이름, 장소, 시간, 날짜
create table space (
	id int,
    name varchar(20),
    place varchar(50),
    startTime int,
    date varchar(40)
);

select * from space;

insert into space(id, name)
values (2171422, "최용석");

insert into space
values (2171232, "백종훈");

select id from space
where name = "최용석";

select id from space
where name = "백종훈";

delete from space
where id = '2171422';

select *  from space;

update space
set id = '2171333', name = "최용석"
where id = '2171422';





