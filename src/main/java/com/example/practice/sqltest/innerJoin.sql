/*
  INNER JOIN
  - 아래의 조인에서 deptno를 기준으로 조인을 하였기 때문에 아직 부서가 결정되지 않은 매니져는
  결과로 출력되지 않는다.

  각 부서 매니저의 사원 번호 , 사원 이름 , 부서이름을 출력하시오.
 */
SELECT a.empno,
       a.ename,
       a.deptno,
       b.dname
FROM emp a,
     dept b
WHERE a.job = "MANAGER"
  AND a.deptno = b.deptno

SELECT a.empno,
       a.enmae,
       a.deptno,
       b.dname
FROM emp a
         INNER JOIN dept b
                    ON a.deptno = b.deptno
WHERE a.job = 'MANAGER'