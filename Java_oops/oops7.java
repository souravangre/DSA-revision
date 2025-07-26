//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//Abstraction can be achieved with either abstract classes or interfaces 

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).


public class oops7 {
    public static void main(String[] args) {
        displayhero obj = new displayhero();
        obj.herocolor();
        obj.heroname();

        vehicle2 obj2 = new vehicle2();
        obj2.func();
        } 
        
    }

abstract class heroes{
    public abstract void heroname();  // Method accessible via the inheritance only. No body

    public void herocolor(){
        System.out.println("The color of hero is Awesome!"); // Method accessible
    }
}

class displayhero extends heroes{
    public void heroname(){
        System.out.println(("the Heroname is Batman"));
    }
}

// Abstraction with the interfaces (Full Abstraction)

interface  vehicle {
     void func(); //-- Default abstract
    // public void func2(){}   --> This will result into an error

}
class vehicle2 implements vehicle{
    public void func(){
        System.out.println("Abstraction with the interface");
    }

}

//🔹extends is used for:
// Class-to-Class inheritance (Single Inheritance)
// Interface-to-Interface inheritance

// 🔹 implements is used for:
// Class-to-Interface implementation

// Java does not support multiple inheritance of classes (to avoid ambiguity), but a class can implement multiple interfaces.