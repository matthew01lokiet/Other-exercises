SELECT CASE 
    WHEN A + B <= C OR A + C <= B OR B + C <= A THEN 'Not A Triangle'
    WHEN A = B AND A = C AND B = C THEN 'Equilateral'
    WHEN NOT A = B AND NOT A = C AND NOT B = C THEN 'Scalene'
    ELSE 'Isosceles'
END AS a
FROM TRIANGLES;