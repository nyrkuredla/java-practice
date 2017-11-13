# Data Types in Java
## Primitive Data Types
(from The Iron Yard's Newline course on Java, originally found here: https://newline.theironyard.com/cohorts/21/courses/7)

* The most basic type of data type in Java.
### Boolean
I've seen this before in JavaScript; true or false.
### Integer / Int
A whole number ranging from -2147483648 to 2147483647.
### Double
Represent decimal numbers, or rather an estimate of decimal numbers (since it's hard to precisely represent decimals with computers. Still, this is the closest we've got).

**NOTE:** Integers can be *widened* into doubles, since the range of integers is included in the set of doubles. However, this obviously doesn't work the other way around; you cannot declare a variable as an integer and then reassign a decimal value to it.

### Null
Again, we've seen this before; the difference here is that *null* is used for **non-primitive variables** in Java only. Setting a primitive to null will throw an error.

### Other data types: byte, char, short, long, float
(from: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
A few notes about each:
* Bytes range from -128 to 127 and are most used to save memory or serve as a kind of documentation for small integers.
* Char is a single Unicode character.
* Short is similar to byte in that its limited range (-32768 to 32767) can be useful in some applications for memory reasons.
* Long represents a wider range than int.
* Float: "This data type should never be used for precise values...use Float if you need to save memory in large arrays".
* Basically, these data types I think are good to know about but I don't think I'll be using them super often at first, so. Back burner stuff.

## Other Java Types: Classes
Classes are basically more complex data types.

### String
Collections of *chars*. Note that in Java, you **must** use double-quotes to declare a String.
* Strings can be concatenated using the **+** operator just like in JS.   
