/*
  LEFT OUTTER JOIN

  INNER JOIN에서는 부서가 배정된 매니저만 결과셋으로 나왔다.

  하지만 LEFT OUTTER JOIN의 경우
  기준 테이블인 emp에서 매니저의 부서가 발령되지 않아 부서번호가 없는 매니저의 경우도 결과셋으로 출력된다.

  한 마디로 , emp 테이블의 deptno가 null 이어서 조인이 되지 못한 경우도 emp 테이블에서 해당 값을 가져와 출력해준다.
 */


SELECT a.empno,
       a.ename,
       a.deptno,
       b.dname
FROM emp a,
     dept b
WHERE a.deptno = b.deptno(+)
  AND a.job = 'MANAGER'

SELECT a.empno,
       a.ename,
       a.deptno,
       b.dname
FROM emp a
         Left OUTER JOIN dept b
                         ON a.deptno = b.deptno
WHERE a.job = 'MANAGER'

