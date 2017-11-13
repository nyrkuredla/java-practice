# Methods in Java
(from https://newline.theironyard.com/cohorts/21/courses/7/objective_lessons/88)

## Method arguments

Remember that variables have to be explicitly typed when they are declared; similarly, method arguments do, too.

```java
public class Example {

    public static void main (String[] args) {
        int x = 5; //uh oh
        String y = "hello";
        shoutGreeting(x, y);
    }

    public static String shoutGreeting (String firstName, String lastName) {
        return "HELLO THERE " + firstName.toUpperCase() + " " + lastName.toUpperCase() + "!!!!";
    }
}
```

returns the error:

>Example.java:6: error: incompatible types: int cannot be converted to String

This is because we've tried to put an Int variable into a String slot. In JavaScript we'd be able to do this, but with the danger that subsequent functions (e.g. toUpperCase()) would break later on. So the advantage here is that once the argument passes the initial barrier of acceptance into the method, we know that later methods performed on it will not break due to its being the wrong type.

Method arguments can still be *null*, though, so there's some wiggle room for errors :)

## Void

All methods in Java have to return something, *unless* they are specifically declared as *void*. Otherwise, attempting to run a method that doesn't return anything will always spit out a "missing return statement" complaint.

What happens if you know that a portion of your code (for example, inside a conditional block) will return something, but Java doesn't know that? You can add a dummy return statement to satisfy the compiler requirement, with the knowledge that it will never be reached.

```java
public class Example {
    public static void main(String[] args) {
      int x = 5;
      int y = 8;
      compare(x, y);
    }

    public static boolean compare (int x, int y) {
        if (x > y) {
            return true;
        }
        if (y > x) {
            return false;
        }
        if (y == x) {
            return true;
        }
        return false; //This line should never be reached
    }
}
```
