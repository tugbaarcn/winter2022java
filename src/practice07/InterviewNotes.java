package practice07;

public class InterviewNotes {

    /*
    1) Explain main() method in Java.
    -Main method is the block where we run our code.
    -It is one of the most important method in Java
    -It is like an engine.
    -We can not run our programs without main method.
    -We cannot overload main method.
    -It is must for execution


     2)What kind of data types we have in Java?
     We have primitive and non-primitive data types
     -Primitives are created by Java, we cannot create any primitive data type.
     int, short, long, byte, double, boolean, char,float
     They are stored in stack memory, they have just values inside it.
     -Non-primitive data types can be created by programmers. ex: String, Arrays..
     They have values and methods inside it, They stored in heap memory.



     3) What is String?
     String is a Java class and data type.
     We can create Strings to store a sequence of characters.
     We use double quotes to assign a value to a String.
     Strings are immutable
     They have values and many useful methods.


     4)What is the purpose of having Wrapper class in Java?
     We do not have any useful method for primitive ones, Java created Wrapper class
     We can use Wrapper class with methods.
      boolean ==> Boolean
      char ==> Character
      byte ==> Byte
      short ==> Short
      int ==> Integer
      long ==> Long
      float ==> Float
      double ==> Double




      5) What are if-else statements in Java, and what they are used for?
      If we need an action under condition, we can use if-else statements.
      It will execute a code block if the condition is true, it will execute another code block if the condition is false
      if(){}



      6)What are the variable types?
      instance(object), local, static(class)
      -Local variables: variables are created in the methods. I can use them inside the methods.
      -Instance variables: We created the instance variables right under the class, out of any methods.
                           I can use instance variables outside the class by using objects.
      -Static variables: Used for common issues.
                         No need to create object to use static variables.
                         All changes can be seen


     7) What is the advantage of using methods in Java?
        The main advantage is code re-usability. We can create a method once, cwe can call it when needed.
        They make main method more clear. They make our code more readable.

    8) What is the "method signature"?
      -the name of method and the parameters
      Which methods are same according to Java?
      -If the method signature is same for methods, then java accepts them as same.
      What is the difference between "method overloading" and "method overriding"
      overloading is changing parameters, in overriding we cannot touch the signature.
      Private, static and final methods can not be overridden.
      overriding + overloading = poly-morphism



     9)What is constructor?
     It is a code block to create object from classes.
     Constructor is a constructor:)
     Constructor names should be the same with class name.
     The constructor is called when an object will create of a class.



     10)What are the differences between methods and constructors?
     Constructors do not have any return type. But methods should have.
     We can create methods with any name, but constructors' name must be the same with class name.
     Constructors are called automatically when a new object is created.
     Method are called by class name or by object.
     Java created default constructor for every class.


     11) What is mutable/immutable in Java?
         mutable=> value changes without assigning => String Builder
         immutable => value does not without assigning => String



     12)What are the differences between "throw" and "throws" keyword?
     -"throw" is used in method body, "throws" is used in method signature
     -after "throws" you can use multiple Exception Class Names. but after "throw" you can use new keyword and the constructor of Exception class.
     -"throws" can be used just once, we can use "throw" keyword many times in a method body.



     */



}
