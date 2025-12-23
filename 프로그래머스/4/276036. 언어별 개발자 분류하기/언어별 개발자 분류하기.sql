-- 코드를 작성해주세요
SELECT (CASE
            WHEN (SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE CATEGORY = 'Front End')) > 0 
                    # CATEGORY의 경우 여러개가 조회될 수 있으므로 SUM을 사용해야 한다
                AND 
                 (SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python')) > 0
                THEN 'A'
            WHEN (SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')) > 0
                THEN 'B'
            WHEN (SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE CATEGORY = 'Front End')) > 0
                THEN 'C'
        END
       ) GRADE,
       ID,
       EMAIL
FROM DEVELOPERS
WHERE 
    (SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE CATEGORY = 'Front End')) > 0
    OR
    (SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#')) > 0
ORDER BY 1, 2

#쉽게 체육대회의 예를 들면
#WHERE절은 출전 조건(축구부이거나 농구부면 경기장 입장 가능!)
#SELECT에서의 CASE는 메달 분류(축구와 농구를 모두 하면 금메달(A) 농구만 하면 은메달(B) ...)