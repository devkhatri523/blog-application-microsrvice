#Api GateWay using Spring Cloud Load Balancer for a blog application built with Spring Boot ,Java ,Spring cloud for load balancing. PostgreSQL is used as the database to store newly added user.

The two entities are:
1. `register` entity with attributes -

   i. `username`

   ii. `password`

2. `authenticate` entity with attributes -

   i. `username`

   ii. `password`

   iii.`email`

   iv.`phone`

   v.`name`

   vi.`businessTitle`

The endpoints for posts are:

1. POST : /register - Add a new user.
2. POST : /authenticate - Authenticate user and authorize.




