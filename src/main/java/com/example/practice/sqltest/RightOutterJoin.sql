/**
  아래의 조인은 Right Outter Join으로 기준 페이블이 dept가 된다.
  때문에 deptno의 데이터를 전부 조회하고 emp와 조인을 한다.
  이때 b 테이블이 메인이기 때문에 b테이블에는 있지만 a테이블에 join할 데이터가 없다면 b테이블의 값을 그냥 그대로 출력한다.



 */

SELECT a.empno
     , a.ename
     , a.deptno
     , b.deptno
     , b.dname
FROM emp a
   , dept b
WHERE a.deptno(+) = b.deptno
  AND (a.job = 'MANAGER'
    OR a.job IS NULL)

SELECT a.empno
     , a.ename
     , a.deptno
     , b.deptno
     , b.dname
FROM emp a
         RIGHT JOIN dept b
                          ON a.deptno = b.deptno
WHERE (a.job = 'MANAGER' OR
       a.job IS NULL
          )
