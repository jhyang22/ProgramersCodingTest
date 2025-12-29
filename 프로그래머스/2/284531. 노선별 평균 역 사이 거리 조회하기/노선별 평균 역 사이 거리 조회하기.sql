SELECT ROUTE,
       CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km') TOTAL_DISTANCE,
       CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
# 그냥 2 desc로 할 경우 문자열 정렬이 되어 본래 의도대로 조회되지 않을 수 있다!
# ex) 9km와 52km가 있다면 문자열 정렬기준으로는 9가 5보다 크기 때문에 조회가 제대로 되지 않을 수 있음
ORDER BY ROUND(SUM(D_BETWEEN_DIST), 1) desc