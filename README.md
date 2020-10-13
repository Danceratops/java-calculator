# Java Calculator
Objective: To become more familiar with Java. A simple calculator to complete a school project. 

## Calculator.java
The main portion of the program that contains the main function. Run java Calculator on this file to start the project in console.

### main
The controller of the program, calls to other classes to perform actions.

## Menu.java
Class that controls I/O aspects of the program.

### displayMenu
Displays a menu on the console. No parameters and no returns.

### getOperation
Requests the user for an operation based on the menu provided. Returns the choice as a string and no parameters required.

### getOperands
Requests the user for operands and returns it as a float. No parameters required.

## Operators.java
Class that controls logic behind the calculator program.

### Variables

####   operator - string
#### integerOne - float;
#### integerTwo - float;
#### results - float;

### addition
Performs addition on variables integerOne and integerTwo, returns this operation as a float. No parameters required.

### subtraction
Performs subtraction on variables integerOne and integerTwo, returns this operation as a float. No parameters required.

### multiplication
Performs multiplication on variables integerOne and integerTwo, returns this operation as a float. No parameters required.

### division
Performs division on variables integerOne and integerTwo, returns this operation as a float. No parameters required.

### modulus
Finds the remainder after division on variables integerOne and integerTwo, returns this operation as a float. Warns user of decimal chop off. No parameters required.

### quit
Force quits the program when called. No parameters required.
