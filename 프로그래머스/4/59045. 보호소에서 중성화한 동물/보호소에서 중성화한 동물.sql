-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
FROM ANIMAL_INS i LEFT JOIN ANIMAL_OUTS o on i.ANIMAL_ID=o.ANIMAL_ID
WHERE i.SEX_UPON_INTAKE LIKE "Intact%" AND NOT o.SEX_UPON_OUTCOME LIKE "Intact%"
ORDER BY i.ANIMAL_ID