🔐 Spring Security + JWT Authentication

This project demonstrates a production-ready authentication and authorization system built with Spring Boot, Spring Security, JWT, and MySQL.

It covers:

Form-based authentication

Stateless JWT authentication

Multi-user authentication (in-memory and database)

Role-based access control (RBAC)

SecurityContext usage

Handling 401 and 403 errors

Password encryption with BCrypt

Integration-ready for microservices and SSO

🏗️ Architecture Overview
Client
  ↓ (HTTP Request with JWT)
Spring Security Filter Chain
  ↓
JWT Validation Filter
  ↓
SecurityContext (Authentication)
  ↓
DispatcherServlet
  ↓
Controller → Service → Repository → Database


Explanation:

Filter Chain: All requests pass through Spring Security filters before reaching controllers.

JWT Validation: If JWT is present, it is validated, and user info is extracted.

SecurityContext: Spring stores an Authentication object for the current request.

DispatcherServlet → Controller: Only authenticated and authorized requests reach controllers.

🔑 Authentication Flow

Login with username & password:

User submits credentials to /login

AuthenticationManager receives the request

Delegates to appropriate AuthenticationProvider (DAO, JWT, etc.)

Credentials are verified (passwords hashed with BCrypt)

If successful, Spring creates an Authentication object

Stores it in SecurityContext

Issues JWT to the client (if using JWT authentication)

JWT Flow (Stateless Authentication):

Client sends JWT with every request

Spring validates JWT, extracts user info

Populates SecurityContext

Roles are checked before accessing protected endpoints

🛠️ Authentication Providers Used

DaoAuthenticationProvider → Authentication from database via UserDetailsService

InMemoryAuthenticationProvider → For demo/testing purposes

JwtAuthenticationProvider → Validates JWT for stateless API requests

OAuth2LoginAuthenticationProvider → For OAuth2 / Keycloak / SSO logins

Note: External identity providers like Keycloak integrate via OAuth2/OIDC. Spring uses JWT or OAuth2 providers to trust tokens issued by Keycloak.

🔒 Role-Based Access Control (RBAC)

Users can have roles like ROLE_USER and ROLE_ADMIN

Spring Security checks roles using:

hasRole("ADMIN")
hasRole("USER")
@PreAuthorize(...)


401 Unauthorized → User is not logged in

403 Forbidden → User is logged in but does not have the required role

🧠 SecurityContext & Authentication

SecurityContext carries a single Authentication object which contains:

Principal → User identity (UserDetails)

Credentials → Password (or null after authentication)

Authorities → Roles and permissions

isAuthenticated → Boolean flag

Even in stateless JWT authentication, Spring uses SecurityContext for request-level authorization.

Authentication auth = SecurityContextHolder.getContext().getAuthentication();
String username = auth.getName();
Collection<? extends GrantedAuthority> roles = auth.getAuthorities();

🛡️ Password Security

Passwords are never stored in plain text

Spring Security uses BCryptPasswordEncoder

Flow:

raw password → BCrypt hash → store in DB


During login, input password is hashed and compared with DB hash

🚀 Features

Multi-user authentication (in-memory + MySQL)

JWT-based stateless authentication

Role-based access control (RBAC)

Spring Security Filter Chain explained

Exception handling for 401 & 403

Ready for integration with frontends or microservices

🗂️ Tech Stack

Java 17+

Spring Boot 3.x

Spring Security 6.x

MySQL

JWT (io.jsonwebtoken / jjwt)

Maven

