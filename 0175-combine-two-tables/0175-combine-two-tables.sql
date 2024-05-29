# Write your MySQL query statement below
select firstname,lastname,city,state
from person
left join address using (personid)
#ere city is null then city='Null' 