create database naraDB;

use naraDB;

show tables;
DESC tbl_buyer;
drop table tbl_buyer;

Insert INTO tbl_buyer(userid, name)
values('B001','홍길동');

Insert INTO tbl_buyer(userid, name)
values('B002','이몽룡');

SELECT * FROM tbl_buyer;
SELECT * FROM tbl_sales;

-- 상품별로 몇 번 씩 판마되었나ㅣ
select pname, count(pname) FROM tbl_sales
GROUP BY pname
ORDER By count(pname) DESC;

-- 상품별로 총 몇개씩 판매되었나
SELECT pname, sum(qty) FROM tbl_sales
GROUP BY pname;
