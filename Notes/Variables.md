# Variables in Java
(from: https://newline.theironyard.com/cohorts/21/courses/7/objective_lessons/87)

## A few things to note:
* Static typing: all variables must be set with the variable type and name; optionally, an initial value can also be set.
* **NOTE** when doing integer math, that doing any kind of division might be tricky. Where you'd expect a decimal value (1 / 4 = 0.25, for example), this will NOT happen with integer division in Java due to the type of data being represented. It will instead return 0, since 0 is the rounded-down integer closest to the answer. Just something to be aware of.


## Naming Variables in Java
### Naming rules:
* Variables are case sensitive;
* Variables can only start with letters, _ or $.

### Naming conventions:
* Avoid unnecessary abbreviation;
* Use camelCase;
* Single-letter variables are only for things like loop counters;
* But also avoid unnecessarily long variable names;
* At the same time, recognize when length is necessary for clarity;
* In short, be descriptive but not verbose, concise but not confusing.
* **Special note:** Final variables or CONSTANTS should be in ALL_CAPS_WITH_UNDERSCORES. These variables are specifically set with the *final* keyword and cannot be reassigned:

```java
final int MAX_GUESSES = 5;
MAX_GUESSES = 3; //not allowed!
```
