# Writing good Java code
*Read on for some essential pointers that can help you write cleaner, more maintainable Java code.*

##Useful references:
*Writing good Java code* : Strive to write clean, easily maintainable Java code [Link](http://www.ibm.com/developerworks/library/j-perry-writing-good-java-code/index.html).

##Best coding practices

You have to know enough Java syntax under your belt to write basic Java programs. Before you continue on to more-advanced topics

##Keep classes small
Keep your classes tightly focused to do a small number of things and do them well and keep only the methods that you need.
Some classes might be that large out of necessity, but most likely they need to be refactored. 
>Refactoring is changing the design of existing code without changing its results.

##Name methods carefully
A good coding pattern when it comes to method names is the **_intention-revealing method-names pattern_**.
>This pattern is easiest to understand. 

__Which of the following method names is easier to understand?__</br>
`- a()` </br>
`- computeInterest()` </br></br>
The answer is `computeInterest()` because you might not remember what you meant to do with a method called ` a()`
but it's obvious that a method called `computeInterest()`

##Keep methods small
Small methods are as preferable as small classes.
Limit each method to a single job. I've found that a method doing only one thing well doesn't usually take more than about 30 lines of code.

##Use comments
Comments are used to describe the purpose of a function or code. </br>
*Use comments, the people who follow along behind you (or even you) will thank you.*

##Use a consistent style
Coding style is a matter of personal preference, but I advise you to use standard Java syntax for braces:
```
public static void main(String[] args) {
}
```
Don't use this style:
```
public static void main(String[] args)
{
}
```
Or this one:
```
public static void main(String[] args)
  {
  }
  ```
  
##Use built-in logging
  Before Java 1.4 introduced built-in logging, the canonical way to find out what your program was doing was to make a system call like this one:
  ```
public void someMethod() {
  // Do some stuff...
  // Now tell all about it
  System.out.println("Telling you all about it:");
  // Etc...
}
```
##Exercise
Please following by **TODO**.</br>
[Exercise 1](https://github.com/kakmond/codeguide/blob/master/src/practice/Person.java) </br>
[Exercise 2](https://github.com/kakmond/codeguide/blob/master/src/practice/Student.java)
