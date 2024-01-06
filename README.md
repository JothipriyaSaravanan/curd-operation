# curd-operation

 Management API

This Java-based RESTful API, built using Spring Boot, serves as a robust system for managing tasks with CRUD functionalities. The API seamlessly integrates with a MySQL database to persistently store task information.
In this layout it shows the 

![Screenshot-1](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/2381c964-cb9c-457d-b4bf-d91d9bb489ab)


API Endpoints

1. Add the User
   
Endpoint: POST / "http://localhost:8081/add"
Description: Add a User to the database.
Request Body: JSON payload containing task information (e.g.,username,phone,email).
Response: The data will bw added inside the database.

![Screenshot-2](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/135cb932-6e94-43dc-b95f-dcd0377cf563)


![Screenshot -3](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/08cb8c54-ceec-46b6-8496-31312666b0f1)


![Screenshot-4](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/7358b4ac-8ee1-4868-8982-05e3ce6eddc6)

User data hasbeen added



2. Get the user details based on id
   
Endpoint: GET /"http://localhost:8081/get/1"
Description: Retrieves a user detail .
Response: Returns a JSON array containing user details.

![Screenshot-5](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/f75b58c0-35a6-47bc-bb8a-c670920ed087)

User Data hasbeen Displayed



3. Update a User detail

Endpoint: PUT /"http://localhost:8081/update/1"
Description: Updates the details of a specific task based on the provided ID.
Request Body: JSON payload containing updated task information.
Response: Returns the updated task details or user is not found.

![Screenshot-6](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/8e7a3638-26c2-4bdb-a6be-a0b6bf7349fb)



4. Delete a Task


Endpoint: DELETE /http://localhost:8081/delete/15
Description: Deletes a specific task based on the provided ID.
Response: the user will be deleted successfull.


![Screenshot-7](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/7da77a7d-3b16-43ea-8ad8-f295b6a493eb)


![Screenshot-8](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/3f044497-52f5-427f-9957-b8e7137527dc)


The id 15 Data hasbeen deleted


5.Search

Description: Search the Data based on the id
Response: it willl return the data based on id.


![Screenshot-9](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/adc455cd-0ff2-4d19-88c8-6fba3e8e8607)


![Screenshot-10](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/3b1d3846-9fc2-41ba-9af0-c1126cc04387)

The search data hasbeen viewd.

6.Mark as Read

Description: Ensure the mark as read
Response: If click mark as read it will show readed.

![Screenshot-11](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/d636a30e-d834-48ab-8d16-bda9eefd0f26)


![Screenshot-12](https://github.com/JothipriyaSaravanan/curd-operation/assets/155729866/d8df3eb9-302a-42dc-83be-b1706645858c)


Database Integration

The API utilizes a MySQL database to store task information persistently. The database schema includes tables designed to efficiently manage task details. The system connects seamlessly to the database, enabling smooth execution of CRUD operations.

