# Сinema application
"Cinema application" is a application based on the knowledge of Java Core, JDBC, SQL, WEB, Hibernate, Spring. This project allows you to do main CRUD operations, maintains authentication, creation and simulates common ticket-purchase apps. All information is saved to the database. 
____
## General info

Lets sign in with login: "admin@i.ua", password: "admin123".

You can add new models by using [postman](https://www.postman.com/). For example:
* movie-sessions in JSON format: {"movieId":"1","cinemaHallId":"1","showTime":"20.11.2021 11:11"}
* movie in JSON format: {"movie": "1+1","description": "Wow"}
* cinema hall in JSON format: {"capacity": "100","description": "Boston"}

Other valid operations you can find in SecurityConfig class
____
## Technologies
* Java 8
* MySQL
* Hibernate
* Spring (Spring Core, Spring Web, Spring Security)
* Maven
* Tomcat 9.0.46
____

## Setup
1) To run this application please install:
* [IntelliJ IDEA Ultimate](https://www.jetbrains.com/lp/intellij-frameworks/)
* [MySQL](https://www.softportal.com/software-65-mysql.html)
* [Tomcat](https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.50/bin/)
2) Fork this project and clone it. 
3) Create properties in resources/db.properties 
4) Add Tomcat 9.0.46 configuration.
