CREATE DATABASE BTH4
USE BTH4

CREATE TABLE SINHVIEN(
	mssv varchar(8) PRIMARY KEY,
	hoTen nvarchar(30),
	ngaySinh smalldatetime
)

CREATE TABLE DIEM(
	mssv varchar(8) PRIMARY KEY,
	toan float,
	ly float,
	hoa float,
	DTB AS (toan + ly + hoa) / 3 PERSISTED
)

alter table DIEM add constraint FK_DIEM_SINHVIEN FOREIGN KEY (mssv) REFERENCES SINHVIEN(mssv)


insert SINHVIEN values('09520001',N'Thạch Sanh','01/01/1995')
insert SINHVIEN values('09520002',N'Lý Thông','02/02/1995')
insert SINHVIEN values('09520003',N'Bạch Tuyết','03/03/1995')
insert SINHVIEN values('09520004',N'Chí Phèo','07/07/1996')
insert SINHVIEN values('09520005',N'A Phủ','09/09/1995')

insert DIEM values('09520001',6,4.5,7)
insert DIEM values('09520002',10, 10 ,10)
insert DIEM values('09520003',5, 7, 8)
insert DIEM values('09520004',9.5, 10, 9)
insert DIEM values('09520005',7, 7, 7)

