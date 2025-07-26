// Encapsulation - hides the sensitive data fromn the users
// The variables,attributes, classes are defined in a private modifier
// this data can be accessed using the get and set method


// Data hiding	             Internal object details are hidden from the outside
// Access via methods   	 Fields are accessed and modified using getters and setters
// Security	                 Prevents unauthorized access/modification
// Maintainability	         Makes it easier to update the implementation later without affecting external code


public class oops5 {
    public static void main(String[] args) {
        Students obj =new Students("Angre");
        obj.setName("AngreSourav");
        obj.getName();
        System.out.println(obj.getName());
        obj.display();
    }

}

class Students{
    private String Name;

    Students(String Name){
        this.Name = Name;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public String getName(){
        return Name;
    }
    void display(){
        System.out.println(Name);
    }
}
