create database `student_management`;
use `student_management`;
create table student(
`id` int not null,
`name` varchar(45) null,
`age` int null ,
`country` varchar(45) null ,
primary key(`id`));

create table class(
`class_id` int not null ,
`name` varchar(45) null,
foreign key (class_id) references student(id) );

create table teacher(
`teacher_id` int not null,
`name` varchar(45) null ,
`age` int null ,
`country` varchar (45) null ,
foreign key (teacher_id) references student(id));