SELECT a.TITLE,
       a.BOARD_ID,
       b.REPLY_ID,
       b.WRITER_ID,
       b.CONTENTS,
       DATE_FORMAT(b.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD a
         LEFT OUTER JOIN USED_GOODS_REPLY b
                         ON a.BOARD_ID = b.BOARD_ID
WHERE DATE_FORMAT(a.CREATED_DATE, '%Y-%m') = '2022-10'
  AND b.CONTENTS IS NOT NULL
ORDER BY CREATED_DATE ASC, a.TITLE ASC;
-- https://school.programmers.co.kr/learn/courses/30/lessons/59034