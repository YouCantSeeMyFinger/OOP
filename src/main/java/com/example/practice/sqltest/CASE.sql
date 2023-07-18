-- 가정문 문법
-- https://school.programmers.co.kr/learn/courses/30/lessons/164672?language=mysql

-- MySql
SELECT BOARD_ID,
       WRITER_ID,
       TITLE,
       PRICE,
       IF(STATUS = 'SALE', '판매중', IF(STATUS = 'RESERVED', '예약중', '거래완료')) AS STATUS
FROM USED_GOODS_BOARD
WHERE DATE_FORMAT(CREATED_DATE, '%Y-%m-%d') = '2022-10-05'
ORDER BY BOARD_ID DESC


-- Oracle Decode
SELECT BOARD_ID,
       WRITER_ID,
       TITLE,
       PRICE,
       DECODE(STATUS, 'SALE', '판매중', 'RESERVED', '예약중', 'DONE', '거래완료') AS STATUS
FROM USED_GOODS_BOARD
WHERE TO_CHAR(CREATED_DATE, 'YYYY-MM-DD') = '2022-10-05'
ORDER BY BOARD_ID DESC

-- Oracle CASE - WHEN - ELSE - END
SELECT BOARD_ID,
       WRITER_ID,
       TITLE,
       PRICE,
       CASE
           WHEN STATUS = 'SALE' THEN '판매중'
           WHEN STATUS = 'RESERVED' THEN '예약중'
           WHEN STATUS = 'DONE' THEN '거래완료'
           ELSE '준비중'
           END AS STATUS

FROM USED_GOODS_BOARD
WHERE TO_CHAR(CREATED_DATE, 'YYYY-MM-DD') = '2022-10-05'
ORDER BY BOARD_ID DESC