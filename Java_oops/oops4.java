//Inheritance is the process by which one class acquires the properties and behaviors (fields and methods) of another class.
public class oops4 {
    public static void main(String[] args) {
        operationsB objB = new operationsB();
        objB.add();
        objB.mul();
        operationsC objC = new operationsC();
        objC.add();
        objC.mul();
        objC.div();
        operationsD objD = new operationsD();
        objD.sub();
        }
}

//Parent class
class operationsA{
    int a =12;
    int b = 2;
    public void add(){
        System.out.println(a+b);
    }

}
// Child Class
class operationsB extends operationsA{
    public void mul(){
        System.out.println(a*b);
    }

}

class operationsC extends operationsB {
    public void div(){
        System.out.println(a/b);
    }
}

class operationsD extends  operationsB{
    public void sub(){
        System.out.println(a-b);

    }
}

// Single - multilevel -hierarchical(two subs from one parent) available
// the multiple(one sub from two parents) and hybrid not possible in java, only possible with interfaces

// Method overriding is a feature of inheritance and a way to implement runtime polymorphism.
//Inheritance lets you reuse the parent methods.
//Method Overriding lets you redefine (customize) them in the child.