# _employMee()

**Authors**: Jenner Dulce, Haustin Kimbrough, Patrick Laurion, Matt Cho

**Version**: 1.0.0

[Active Site](https://employmee-401.herokuapp.com/)

## Overview
<!-- Provide a high level overview of what this application is and why you are building it, beyond the fact that it's an assignment for this class. (i.e. What's your problem domain?) -->

**\_employMee()** is a connection-based professional employment services recruiting website designed to align skilled software developers with motivated employers looking to hire without the hassle. At **\_employMee()**, developers from all languages, experience levels, and backgrounds are offered a simple, no-stress alternative to the hiring process. Developers can leisurely job hunt without worry of discrimination against age, race, or gender through our simplified presentation of their skills which omits these identifiers. Employers are offered quick, targeted searches of developers based on the desired language which allows for an informed decision when filling a position. We guarantee commitment from our applicants!

## Architecture
<!-- Provide a detailed description of the application design. What technologies (languages, libraries, etc) you're using, and any other relevant design information. -->

**_employMee()** primarily uses the Java language with the [Gradle](https://gradle.org/) build system and the [Spring framework](https://spring.io/projects/spring-framework), specifically [SpringMVC](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html). Initial setup is done with [Spring Initializr](https://start.spring.io/), selecting the following dependencies:
1. [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using.html#using.devtools)
2. [Spring Web](https://spring.io/projects/spring-ws)
3. [Thymeleaf](https://www.thymeleaf.org/)
4. [Spring Security](https://spring.io/projects/spring-security)
5. [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
6. [PostgreSQL Driver](https://jdbc.postgresql.org/)

**_employMee()** uses the Thymeleaf template engine for dynamic HTML displays and [Bootstrap](https://getbootstrap.com/) for elegant styling. Core communication functionality is created using [Twilio](https://www.twilio.com/), specifically the [SendGrid](https://www.twilio.com/sendgrid/email-api) email API and [Gmail](https://www.google.com/gmail/).

The application is hosted on [Heroku](https://www.heroku.com/) with a remote database linked to [PostgreSQL](https://www.postgresql.org/) using the Heroku Postgres add-on and [pgAdmin 4](https://www.pgadmin.org/) graphical user interface to help manage it.

## Wireframing

### 1. Index

<img src= "./assets/index.png" alt="index.html wireframe" width="350"/>

### 2. Sign Up

<img src= "./assets/signup.png" alt="signup.html wireframe" width="350"/>

### 3. Login

<img src= "./assets/login.png" alt="login.html wireframe" width="350"/>

### 4. Discover

<img src= "./assets/discover.png" alt="discover.html wireframe" width="350"/>

### 5. Business Profile

<img src= "./assets/profileBusiness.png" alt="business profile wireframe" width="350"/>

### 6. Candidate Profile

<img src= "./assets/profileCandidate.png" alt="candidate profile wireframe" width="350"/>

## User Stories

- As a hiring manager, I want a simple layout of potential employees, so that I can find qualified candidates more efficiently.
- As a startup looking for employees, I want a wide variety of job-seeking individuals, so that we can hire the best people.
- As a software developer, I want a way to display my skills/qualifications, so that companies can reach out to me for job opportunities.
- As a business, I want a way to filter potential candidates, so that I don't have to look through hundreds of resumes.
- As a business owner, I want a way to connect with prospecitve employees that meet my qualifications.

## Domain Modeling

![Domain Model](./assets/domainModel.png)

## Database Schema

![Database](./assets/dbSchema.png)

## Other

- [Team Agreement](./TeamAgreement.md)
- [Requirements](./requirements.md)

## Credit and Collaborations
<!-- Give credit (and a link) to other people or resources that helped you build this application. -->
- [Miro](https://miro.com/) for initial wireframing.
- [Trello](https://trello.com/) for project management.
- [Spring Initializr](https://start.spring.io/) for initial setup.
- [Canva](https://www.canva.com/) for logo design.
- [Gmail](https://www.google.com/gmail/) for setting up company email.
- [Stack Overflow](https://stackoverflow.com/) for the struggles.
- [Code Fellows Code 401 Class Repo](https://github.com/codefellows/seattle-java-401d11) for general guidance.