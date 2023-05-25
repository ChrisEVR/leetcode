SELECT w2.Id
FROM Weather AS w1 INNER JOIN Weather AS w2
ON ADDDATE(w1.recordDate, 1) = w2.recordDate
WHERE w2.temperature > w1.temperature;