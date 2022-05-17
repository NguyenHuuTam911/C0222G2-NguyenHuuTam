drop database if exists quan_li_ban_hang;
create database quan_li_ban_hang;
use quan_li_ban_hang;

create table customer(
c_id int,
c_name varchar(55) not null,
c_age int not null,
primary key(c_id));


create table dat_hang(
o_id int ,
c_id int,
o_date datetime,
o_total_price double,
primary key(o_id),
foreign key (c_id) references customer(c_id)
);

create table product(
p_id int ,
p_name varchar(50) not null,
p_price double not null,
primary key(p_id));

create table order_detail(
o_id int,
p_id int,
od_qty varchar(255),
primary key(o_id,p_id),
foreign key (o_id) references dat_hang(o_id),
foreign key (p_id) references product(p_id));
insert into customer
value (1,'minh quan',10),
(2,'ngoc oanh',20),(3,'hong ha',50);
insert into dat_hang
value (1,1,'2006-03-21',null),
(2,2,'2006-03-23',null),
(3,1,'2006-03-16',null);
insert into product
value (1,'May Giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);
insert into order_detail
value (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);

select dat_hang.o_id,dat_hang.o_date,dat_hang.o_total_price from dat_hang;

select customer.c_name,product.p_name from dat_hang
left join customer on customer.c_id = dat_hang.c_id
left join order_detail on order_detail.o_id = dat_hang.o_id
left join product on  product.p_id = order_detail.p_id;

select customer.c_name from customer
left join dat_hang on customer.c_id = dat_hang.c_id
where customer.c_id = 3;

select dat_hang.o_id,dat_hang.o_date,sum(order_detail.od_qty*product.p_price) as gia_ban from dat_hang
inner join order_detail on order_detail.o_id = dat_hang.o_id
inner join product on  product.p_id = order_detail.p_id
group by o_id;
