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