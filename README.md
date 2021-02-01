# Spring_Security_JWT_Role_Based

### Register an user
~~~
curl --location --request POST 'http://localhost:8085/token' \
--header 'Content-Type: application/json' \
--data-raw '{ 
	"subject":"dhananjaya", 
	"id":"9885", 
	"role": "admin"
}'
~~~


### Access a secured endpoint 
~~~
curl --location --request GET 'http://localhost:8085/api/hello' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkaGFuYW5qYXlhIiwiaWF0IjoxNjEyMTkyNjIxLCJleHAiOjE2MTIxOTI5MjEsInVzZXJJZCI6Ijk4ODUiLCJyb2xlIjoiQURNSU4ifQ.HjwGHU-s4Y_ocA3Ph9ZDnVJs8q4B4X5oZLLWygvYIP3wvi8HBUBMHcHGFQa5_6fKQ2YSlJ-D8J5zWURML9Fjlg'
~~~
