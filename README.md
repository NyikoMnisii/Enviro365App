# Enviro365App

## Overview
Enviro365App is a Spring Boot application that provides RESTful APIs for managing waste categories, disposal guidelines, and recycling tips. The application is designed to support sustainable waste management by offering tools for individuals and communities to educate themselves on proper disposal techniques and recycling habits.

---

## Features
- **Waste Categories**: Manage different types of waste (e.g., plastic, glass, organic).
- **Disposal Guidelines**: Provide guidance on how to dispose of specific waste types.
- **Recycling Tips**: Share tips to encourage better recycling practices.
- **Input Validation**: Ensure data integrity with Spring Boot validation annotations.
- **Centralized Error Handling**: Provide consistent API responses for errors.

---

## Technologies Used
- **Programming Language**: Java 21
- **Framework**: Spring Boot 3.1.3
- **Database**: H2 (In-memory)
- **Build Tool**: Maven
- **API Documentatio**: Swagger/OpenAPI
- **Testing**: JUnit and Spring Boot Test Starter

---

## Project Structure
```plaintext
src/main/java/com/enviro/assessment/grad001/NyikoMnisi/Enviro365App
    ├── controller/       # REST Controllers
    ├── service/          # Business Logic
    ├── repository/       # Data Access Layer (Repositories)
    ├── model/            # JPA Entity Models
    ├── exception/        # Global Exception Handling

##Setup Instructions
Prerequisites

    Java: Version 21
    Maven: Version 3.8+
    API Testing Tool:Swagger UI, or cURL

##Running the Application

- **Clone the Repository**

- **git clone <repository_url>**
- **cd Enviro365App**

Build the Project

mvn clean install

Run the Application

    mvn spring-boot:run

   ##Access the application:
        - **Base URL: http://localhost:8080**
        - **Swagger Documentation: http://localhost:8080/swagger-ui.html**
        - **H2 Console: http://localhost:8080/h2-console**

##API Endpoints
- **Waste Categories**
- **Method	Endpoint	Description**
GET	/api/categories	Retrieve all waste categories
GET	/api/categories/{id}	Retrieve a specific waste category
POST	/api/categories	Create a new waste category
PUT	/api/categories/{id}	Update an existing waste category
DELETE	/api/categories/{id}	Delete a waste category
- **Disposal Guidelines**
- **Method	Endpoint	Description**
GET	/api/guidelines	Retrieve all disposal guidelines
GET	/api/guidelines/{id}	Retrieve a specific guideline
POST	/api/guidelines	Create new disposal guidelines
DELETE	/api/guidelines/{id}	Delete disposal guidelines
- **Recycling Tips**
- **Method	Endpoint	Description**
GET	/api/tips	Retrieve all recycling tips
GET	/api/tips/{id}	Retrieve a specific recycling tip
POST	/api/tips	Create a new recycling tip
DELETE	/api/tips/{id}	Delete a recycling tip
##Error Handling

- **The application uses centralized error handling with meaningful error messages.**
- **Example of a validation error response:**

{
  "title": "Title is required",
  "content": "Tip content is required"
}

##Example Request Bodies
- **Waste Categories**

POST /api/categories

{
  "name": "Plastic",
  "description": "Materials made from plastic that can be recycled."
}

- **Disposal Guidelines**

POST /api/guidelines

{
  "guidelines": "Sort plastics by type before disposal.",
  "wasteCategory": {
    "id": 1
  }
}

- **Recycling Tips**

POST /api/tips

{
  "title": "Reuse Plastic Bottles",
  "content": "Reuse plastic bottles for storage or crafting.",
  "wasteCategory": {
    "id": 1
  }
}

##Testing
Manual Testing: Use Postman or Swagger UI to test API endpoints.
