# SN_SPRING
Spring course for ScholaNova

## Getting started
 You must have Java 1.8 installed on your computer 
   
 - Install [Gradle](https://gradle.org/install/)
 - Create a new gradle project in Your favorite IDE (IntelliJ). Set auto-import source file to "true"
 - Create a main function that display "Hello World" in the console
 
 **
 Some little boilerplate. Improve you gradle file with :
 **
 
 - Spring-boot in its latest version
 - the Spring-boot Gralde plugin
 - the Spring-boot-devtools package 
 - the Spring-boot starter package
 - plugins for your IDE, java, spring dependencies management and spring-boot
 

## Practice 1
### Use proper Spring and boot
 1. Create an Application class with the correct annotations
 2. Run it in the console

## Practice 2
### Adding some POJOs
 1. Create a POJO in the domain layer that represents a football player
 2. Create a POJO in the domaine layer that represent a football team
 
 A player can have only team, A team can have multiple players.
 
 3. Do the relationship between players and teams
 
 4. Instantiate a team, 2 players and display them in the console at the startup of the application
 

#### Questions 
 What means POJO ?
 Which logger have you used ?

## Practice 3
### Adding some persistence
 1. Create Entities that represent Football players and teams if necessary
 2. Create the database schema if necessary
 3. Create functions to save and load a Player
 4. Create functions to save and load a Team
 
 5. Create 2 players and one team. Affect the two players to this team. Save them all. Get the last saved player and display it in the console 

 For this step, you will need to improve your gradle file so you can use
 - the Spring-boot starter data JPA package
 - the H2Database H2 package

#### Questions
 Which ORM have you used ?
 How to pre-fill the database at startup ?

## Practice 4
### Display your work in a simple web page
  1. Create a thymeleaf template that display a Football Player
  2. Create a thymeleaf template that display a Football Team
  3. Create an Index page that displays Players and teams
  4. Create 2 players and one team. Affect the two players to this team. Save them all.
  Display the team and the players in your web page. Use the standard configuration (localhost:8080) 
 
  For this step, you will need to improve your gradle file so you can use
  - the thymeleaf package
  - the Spring-boot starter web
 
#### Questions
 Wich http server are you using ?
 Where is the server ?
 
## Practice 5

### Display a lazy loaded relationship
  1. Use JPA annotations to join Player and Team
  2. Create a Team and a Player. Associate the player to the team
  3. Create a web page where we can display a player and the details of his team
  
#### Questions
 What happened ?
 How to solve this ?

## practice 6
### Some crucial CRUD
  1. Add CRUD operations to Players
  2. Add routes to the controllers
  3. Add forms in the web pages to manipulate Players 

## practice 7
### Separate data and view

  1. Create a REST controller that exposes Players via the /players route
  2. Bind all CRUD operations to the corresponding endpoint
  3. Create a custom representation of the Player object
  
#### Questions
 What's the difference in annotations
 
## practice 8
### Handling errors, the RESTfull way
  1. Create customs exceptions according to your business rules
  2. Create ExceptionHandlers at the controller level
  1. Use proper HTTP codes in errors, use customs messages for errors
  
#### Questions
Why are we using runtime exceptions ?

## practice 9
### Unit testing
  1. Create a unit test at the Player level
  2. Create an integration test at the controller level
  3. Test error codes
  
  For this step, you will need to improve your gradle file so you can
  - Use JUnit for testing
  - Use MockMVC and RestTemplate to test your endpoints