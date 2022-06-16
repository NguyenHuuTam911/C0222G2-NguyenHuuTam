
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.

select sub_name,max(credit) from subject;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.

select sub_name , max(mark.mark) as "diem_thi_lon_nhat" from `subject`
join mark on mark.sub_id = `subject`.sub_id;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

select student_name , avg(mark.mark) as "avg" from student
join mark on mark.student_id =  student.student_id
group by student.student_id;

 