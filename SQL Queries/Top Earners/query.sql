SELECT salary*months AS earned, COUNT(*)
FROM Employee
GROUP BY earned
ORDER BY earned DESC
LIMIT 1;
