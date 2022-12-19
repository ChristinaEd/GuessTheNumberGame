# GuessTheNumberGame
Fully operational Java Spring Boot web application with console support, as well as i18n support.

The Guess the Number Game is a simple Java Spring Boot application to demonstrate utilization of technologies such as Java Spring, Java Spring Boot, SLF4J,
Lombok and Thymeleaf in an MVC web application.

The user starts at a Welcome Page, then continues to the main game, where they are given the instructions of the game (i.e. to guess a number within a range of numbers,
default to 0-100 with the option to change in the properties file) and prompted to input a number.

With each guess, the range narrows and the user is told to guess higher or lower until they either guess the correct number or run out of guesses
(default 10, configurable), at which point they are directed to a Game Over screen.

The Game Over screen declares victory or loss and reveals the number, then has an option to either restart the game or return to the home (welcome) page.
