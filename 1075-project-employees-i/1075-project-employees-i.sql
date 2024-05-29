# Write your MySQL query statement below
select f.project_id,round(avg(e.experience_years),2) as average_years
from project f
join employee e  using (employee_id)
group by project_id