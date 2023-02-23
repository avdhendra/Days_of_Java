package Day2;
//Method Overloading means providing two or more separate methods in a class with the same name but different parameters
//Method return type may or may not be different and that allows us to reuse the same method name


//Method will be considered overloaded if both follow the following rules
//Methods must have the same method name
//Methods must have different parameters
/**
 * If method follows the rules above then they may or may not
 * Have different return types
 * have different access modifiers
 * throw different checked or unchecked exception(more or exception later in th )
 * 
 * 
 * 
 * 
 */


 ///Method Overriding
 /**Method overriding means defining a method in a child class that already exists in the parent class with same signature
  * 
  (same name ,same argument)
*By Extending the parent class the child class get all the methods defined in the parent class
*Method overriding is also known as Runtime polymorphism and Dynamic Method Dispatch because the method is going
to be called is decided at runtime by JVM
*/

//we cant override the static method only instance methods can be override
//overloading
class Dog{
public void bark(){
    System.out.print("Boo");
}
public void bark(int number){
    for(int i=0;i<number;i++){
        System.out.print("Woof");
    }
}
}
//overriding
class GermanShepher extends Dog{
    @Override
    public void bark(){
        System.out.print("Woof");
    }
}

//Static Method
/**
 * Static Method are declared using static modifier
 * Static methods cant access instance methods and instance variables directly
 * they are usually used for operations that dont require any data from an instance of the class
 * if you remember the this keyword is the current instance of a class
 * 
 * 
 * Static method we cant use the this keyword
 * whenever you see a method that does not use instance variable that method should be decalred as a static method
 * 
 * 
 * 
 * 
 */

class Calculator{
    public static void printSum(int a,int b) {
System.out.println("sum="+(a+b));
    }
}






public class OOPS3 {
    public static void main(String[] args){
        Calculator.printSum();
    }
}
