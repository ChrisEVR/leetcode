SELECT E.name AS "Employee"
FROM Employee E INNER JOIN Employee M ON E.managerId = M.id
WHERE M.salary < E.salary;