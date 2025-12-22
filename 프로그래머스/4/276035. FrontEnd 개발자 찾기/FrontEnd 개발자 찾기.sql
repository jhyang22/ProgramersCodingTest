-- 코드를 작성해주세요
SELECT DISTINCT d.ID, #비트마스크 조인인 경우 항상 중복 행 의심하기!!
       d.EMAIL, 
       d.FIRST_NAME, 
       d.LAST_NAME
FROM DEVELOPERS d 
JOIN (
    SELECT CODE
    FROM SKILLCODES
    WHERE CATEGORY = 'Front End'
    ) c
ON (d.SKILL_CODE & c.CODE) > 0 #비트마스크 조인. 한 개발자의 스킬안에 front end가 하나라도 포함되어 있다면 모두 조인!
ORDER BY 1
