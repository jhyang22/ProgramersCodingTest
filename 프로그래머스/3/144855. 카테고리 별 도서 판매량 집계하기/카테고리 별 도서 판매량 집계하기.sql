-- 코드를 입력하세요
SELECT CATEGORY, SUM(SALES) TOTAL_SALES
FROM BOOK b LEFT JOIN BOOK_SALES s on b.BOOK_ID=s.BOOK_ID
WHERE s.SALES_DATE LIKE "2022-01%"
GROUP BY CATEGORY
ORDER BY CATEGORY