public class oops2{
    int n1;
    int n2;
    int n3;

    oops2(int n1,int n2,int n3){  // Parameterized constructor
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    public void avg(){
        int avg =(n1+n2+n3)/3;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        oops2 obj = new oops2(2,12,5);
        obj.avg();
    }
}

// Default constructor : No parameters
// Parameterized constructor : Parameters present
// Copy constructor : Unlike other constructors copy constructor is passed with another object which copies the data available from the passed object to the newly created object.

//  Geeks(String name, int id)
//     {
//         this.name = name;
//         this.id = id;
//     }

//     // Copy Constructor
//     Geeks(Geeks obj2)
//     {
//         this.name = obj2.name;
//         this.id = obj2.id;
//     }
// }
// ////////////////////////////////////////////////////
//   Geeks geek2 = new Geeks(geek1);
//         System.out.println(
//             "Copy Constructor used Second Object");
//         System.out.println("GeekName: " + geek2.name)
           