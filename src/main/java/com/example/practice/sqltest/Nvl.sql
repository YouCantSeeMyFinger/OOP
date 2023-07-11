/**
  오라클 쿼리문에는 NVL과 NVL2가 존재

  -NVL
  NVL은 NULL값만 처리가 가능합니다.

  -NVL2
  NVL2는 해당 데이터가 NULL이 아닌 경우 2번째 파라미터를 반환
  NULL 값인 경우 3번째 파라미터를 반환합니다.

 */

SELECT NVL(NUMBER, '해당 번호 없음') AS "번호",
       NVL(NAME, '해당 이름 없음')   AS "이름"
FROM DUAL;

SELECT NVL2(NUMBER, '해당 숫자 존재', ' 데이터가 없습니다.') AS "번호",
       NVL2(NAME, '해당 이름 존재', '데이터가 없습니다.')    AS "이름"
FROM DUAL;