# Write your MySQL query statement below
select s.name as 
customers
from 
Customers s
where id not in (Select customerId from Orders)
