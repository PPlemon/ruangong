
# 创建管理员表
create table admin
(tno int(11) not null,
	tname varchar(50) null,
	tpassword varchar(50) null,
	constraint admin_pk primary key (tno));

# 插入管理员信息
insert into admin values(2019020373,"谭胖","123");
insert into admin values(2019020394,"陈玉立","123");
