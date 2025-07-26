//Polymorphism = poly (many) + morph (forms)
//It means "one name, many forms."

//In Java, polymorphism allows objects to behave differently based on the context, even when they share the same interface or method name.




//Compile-time Polymorphism (Method Overloading) -- When multiple methods in the same class have the same name but different parameter lists.
public class oops3 {

    public void display(String name){
        System.out.println("The display is:"+ name );
    }
    public void display(int number,int secnumber){
        System.out.println("The display is:"+ number + secnumber );
    }
    public void display(double n , int num, String naam){
        System.out.println("The display is:"+ n + num + naam);
    }
    public static void main(String[] args) {
        oops3 obj = new oops3();
        obj.display("Angre");
        obj.display(12, 1);
        obj.display(222, 03, "sourav");
    }
}


// Runtime Polymorphism (Method Overriding) -- When a child class provides a specific implementation of a method that is already defined in the parent class.

class Sports {
    public void display_sports(){
        System.out.println("The name of the Sports is something");
    }
}

class Badminton extends Sports {
    public void display_sports(){
        System.out.println("The name of the Sports is Badminton");
    }
}

class Cricket extends Sports {
    public void display_sports(){
        System.out.println("The name of the Sports is Cricket");
    }
}

class test_polymorphism {
    public static void main(String[] args){
        Sports obj ;
        obj = new Badminton();
        obj.display_sports();
        obj = new Cricket();
        obj.display_sports();
    }
}