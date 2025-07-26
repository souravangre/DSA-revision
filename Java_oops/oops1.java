//OOPS stands for Object-Oriented Programming System. 
//It is a programming approach that organizes code into objects and classes 
//and makes it more structured and easy to manage.
// A class is a blueprint that defines properties and behaviors, 
//while an object is an instance of a class representing real-world entities


// class classes{
//     String animal;
//     public void function() {
//         System.out.println("The name of the animal is" + this.animal);
//     }
// }


// public class oops1 {
//     public static void main(String[] args) {
//         classes obj = new classes();
//         obj.animal = "Dog";
//         obj.function();
//     }
// }


 public class oops1{
    //Data ,Properties
    int a;
    int b;
    //Setters --  set the data values
    public void setA (int a){
        this.a=a;
    }
     public void setB (int b){
        this.b=b;
    }
    //Methods that operate on the values that are set
    public void add(){
        System.out.println(a+b);
    }
     public void sub(){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        oops1 obj = new oops1();
        obj.setA(12);
        obj.setB(4);
        obj.add();
        obj.sub();

    }
 }

class names{
    String name;
    String surname;

    public void setfullname(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    //method
    public void fullname(){
        System.out.println("the full name is:"+ " "+ name +" "+surname);
    }
    public static void main(String[] args) {
        names obj=new names();
        obj.name = "Sourav";
        obj.surname = "Angre";
        obj.fullname();
        
    }
}



