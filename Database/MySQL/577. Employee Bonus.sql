SELECT name, bonus
FROM Employee E
LEFT JOIN Bonus B
ON E.empId = B.empId
WHERE IFNULL(bonus, 0) < 1000;