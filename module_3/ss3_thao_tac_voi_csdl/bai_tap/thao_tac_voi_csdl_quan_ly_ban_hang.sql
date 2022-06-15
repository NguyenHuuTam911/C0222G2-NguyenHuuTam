drop database if exists quanly_banhang;
create database quanly_banhang;
use quanly_banhang;

create table customer(
c_id int,
c_name varchar(55) not null,
c_age int not null,
primary key(c_id));


create table `order`(
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
foreign key (o_id) references `order`(o_id),
foreign key (p_id) references product(p_id));
insert into customer
value (1,'minh quan',10),
(2,'ngoc oanh',20),(3,'hong ha',50);
insert into `order`
value (1,1,'2006-03-21',null),
(2,2,'2006-03-23',null),
(3,1,'2006-03-16',null);
insert into product
value (1,'May Giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);
insert into order_detail
value (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select o_id , c_id , o_total_price from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách

select customer.c_name , product.p_name from customer 
join `order` on `order`.c_id = customer.c_id
join order_detail on order_detail.o_id = `order`.o_id
join product on product.p_id = order_detail.p_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

select c_name from customer
left join `order` on `order`.c_id = customer.c_id
where c_name not in (
select c_name from customer
 join `order` on `order`.c_id = customer.c_id);
 
 
--  Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
--  (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
--  Giá bán của từng loại được tính = odQTY*pPrice)


 select `order`.c_id,`order`.o_id , `order`.o_date , 
 sum(order_detail.od_qty*product.p_price) as 'giá tiền' from `order`
 join order_detail on order_detail.o_id = `order`.o_id
 join product on product.p_id = order_detail.p_id
 group by o_id






