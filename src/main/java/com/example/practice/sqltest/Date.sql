
/**
  오라클 쿼리문을 기준으로 작성한 현재 시간 및 날짜를 나타내는 함수입니다.
  더미 테이블에 결과를 나타냈습니다.

  쿼리문의 자료형에는 다음과 같은 3가지가 있습니다.

  문자 <-> 숫자 <-> 날짜

  숫자를 문자로 변환이 가능합니다.
  문자를 숫자로 변환이 가능합니다.
  숫자를 날짜로 변형이 가능합니다.
  날짜를 숫자로 변형이 가능합니다.
 */
SELECT
    TO_CHAR(SYSDATE , 'YYYY-MM-DD hh24:mi:ss') as "SYSDATE" ,
    TO_CHAR(CURRENT_DATE , 'YYYY-MM-DD hh24:mi:ss') as "CURRENT_DATE" ,
    TO_CHAR(CURRENT_TIMESTAMP , 'YYYY-MM-DD hh24:mi:ss') as "CURRENT_TIMESTAMP"
FROM DUAL