package koans.english;

public class AboutObjects {
    /**
     * Create a class 'geom.Point' with 2 final private decimal members 'x' and 'y'. The constructor should take 'x' and 'y' as parameters.
     * 
     * ---------   TIPS --------------
     * 
     * Up to now, we only attached methods to the classes themselves. But classes can be much more powerful than that.
     * 
     * A class can serve as a template for things called objects. Objects are grouping methods and data.
     * 
     * For example, we could say we need to represent a Person in the code, such that each person could have a name and an age, and an 'introduce' method.
     * 
     * The name and age are kind of variables attached to the object, and can be different from one person to the other. A 'variable' attached to an object is called a 'field'.
     * 
     * The 'introduce' method, similarly, is attached to the object. Calling it on 2 different persons can produce a different result if it is using fields.
     * 
     * You can create an object of a given class by calling a very special method called a constructor. The constructor... constructs an object of the given class.
     * 
     * The result of a constructor is a value, which type is the class itself.
     * You call a constructor by using the 'new' keyword, and the name of the class.
     * Let's see how that goes with a Person class:
     * 
     *     // The constructor of a person takes their name and their age
     *     Person julien = new Person("Julien", 44);
     *     Person stephane = new Person("Stephane", 26);
     * 
     * Now that we have 2 person objects, we can call their methods. We said in our example persons had an 'introduce' method. Let's call it:
     * 
     *     julien.introduce();
     * 
     * Result in the console:
     * 
     * Hello, my name is Julien and I am 44
     * 
     * What happens if we call the same method on stephane?
     * 
     *     stephane.introduce();
     * 
     * Result in the console:
     * 
     * Hello, my name is Stephane and I am 26
     * 
     * A different result! This is because a method attached to an object can access the object's fields, which can be different from one object to the other.
     * 
     * What happens if we call the method on the class itself?
     * 
     *     Person.introduce(); // Error, this is not valid Java
     * 
     * This is producing an error, because the method is attached to the objects of the Person class, not the class itself.
     * By default, a method is attached to the objects of the class. If you want to attach a method on the class itself, you have to say it is 'static'.
     * 'static' means 'attached to the class'.
     * 
     * So how do we declare class fields? Like so:
     * 
     *     public class Person {
     *         // Fields go at the beginning of the class.
     *         private final String name;
     *         private final int age;
     *         
     *         public introduce() {
     *             // In an object's method, we can use object fields
     *             System.out.println("Hello, my name is " + name + " and I am " + age);
     *         }
     *     }
     * 
     * Like variables, fields have a type and a name. Unlike variables, we must specify if they are visible or not by code outside the class.
     * Although Java allows to have fields visible outside the class, it is a bad code design. So they always should be 'private'.
     * They also should be 'final', meaning that once their values is assigned in the constructor, they will never change.
     * 
     * But what about the constructor? Constructors are special methods.
     * They don't specify a return type, because the return type of a constructor is always the Class.
     * And their name is simply the name of the class. Ex:
     * 
     *     public class Person {
     *         // Fields go at the beginning of the class.
     *         private final String name;
     *         private final int age;
     *         
     *         // No return type. Name = name of the class.
     *         public Person(String name, int age) {
     *             // We set the value of the object's fields in the constructor.
     *             this.name = name;
     *             this.age = age; 
     *         }
     * 
     *         public introduce() {
     *             // In an object's method, we can use object fields
     *             System.out.println("Hello, my name is " + name + " and I am " + age);
     *         }
     *     }
     * 
     * We use the 'this' keyword to differentiate the constructor parameters 'name' and 'age' from the object's fields.
     * 'this' is a kind of special variable pointing to the current object. So 'this.[name of a field]' refers to the object's field.
     * 
     * -------------------------------
     * 
     * Expected result:
     * 
     * we can create a new geom.Point object
     * 
     */



}