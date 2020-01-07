
# 创建教改论文表
create table paper
(
	ppno int(6) not null COMMENT '论文编号',
	ppname varchar(50) null COMMENT '论文名称',
	author int(11) null COMMENT '作者',
	journal varchar(50) null COMMENT '期刊',
	pubdate bigint(11) null COMMENT '出版日期',
	rank varchar(50) null  COMMENT '等级：SCI（006）、EI(JA)（007）、EI(CA)（008），核心（009）、计算机教育（010）,一般(011)',
	rankno int(3) not null  COMMENT '等级编号',
	ppurl varchar(100) null COMMENT '论文图片地址',
	isconfirmed tinyint(1) NULL DEFAULT NULL COMMENT '是否被确认',
	constraint paper_pk
		primary key (ppno)
);

# 插入论文信息
insert into paper values(300001,"论文1",2012012010,"",20190203,"SCI",006,"",0);
insert into paper values(300002,"论文2",2012012011,"",20180203,"EI(JA)",007,"",0);
insert into paper values(300003,"论文3",2012012010,"",20170203,"EI(CA)",008,"",0);
insert into paper values(300004,"论文4",2012012013,"",20170203,"核心",009,"",0);
insert into paper values(300005,"论文5",2012012016,"",20170203,"计算机教育",010,"",0);
insert into paper values(300006,"论文6",2012012011,"",20170203,"SCI",006,"",0);
insert into paper values(300007,"论文7",2012012011,"",20170203,"一般",011,"",0);
insert into paper values(300008,"论文8",2012012010,"",20170203,"SCI",006,"",0);
insert into paper values(300009,"论文9",2012012012,"",20170203,"SCI",006,"",0);
insert into paper values(300010,"论文10",2012012013,"",20170203,"SCI",006,"",0);
insert into paper values(300011,"论文11",2012012014,"",20170203,"SCI",006,"",0);
