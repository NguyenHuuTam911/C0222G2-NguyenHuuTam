use quanly_sinhvien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from subjects
where credit in
(select max(credit) from subjects);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.

select subjects.subname,marks.mark
from marks
inner join subjects on marks.subid = subjects.subid
where mark in 
(select max(mark) from marks);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

select student.*, avg(mark) as diem_tb from student
left join marks on student.studentid = marks.studentid
group by studentid
order by studentid desc;



