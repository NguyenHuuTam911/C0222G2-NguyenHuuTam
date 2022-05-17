use quanly_sinhvien;
 select * from student
 where StudentName like 'H%';
 
 select * from class
 where month(startdate) = 12;
 
 select SubName,Credit from `subject`
 where credit<=5 and credit >3;
 
 set sql_safe_updates =0;
 update student
 set classid = 2
 where studentname = 'hung';
 select * from student;
 set sql_safe_updates =1;
 
select student.studentname,subjects.subname,marks.mark from student
inner join marks  on student.studentid = marks.studentid
inner join subjects on marks.subid = subjects.subid
order by mark desc, studentname asc

 
 