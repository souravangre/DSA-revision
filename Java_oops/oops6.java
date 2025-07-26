//In Java, the super keyword is used to refer to the parent class of a subclass.
//The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

//To access attributes and methods from the parent class
//To call the parent class constructor

public class oops6 {
     public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.printType();
  }
}

class Animal {
  String type = "Animal";
}

class Dog extends Animal {
  String type = "Dog";

  public void printType() {
    System.out.println(super.type); // Access parent attribute
  }
}

