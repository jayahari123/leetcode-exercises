# Write your MySQL query statement be
SELECT e.name as name, b.bonus as bonus
FROM Employee e
LEFT JOIN Bonus b on e.empId=b.empID
WHERE b.bonus< 1000 or Bonus IS NULL

