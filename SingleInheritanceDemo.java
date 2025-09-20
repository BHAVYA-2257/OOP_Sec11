package inhertanceSingle;

class Employee {
    String name;
    Employee()
    {
    	name="Swapnika";
    	System.out.println("Iam in Super class Constructor");
    }
    void work() {
        System.out.println(name + " is working...");
    }
}

class Programmer extends Employee {
    Programmer()
    {
    	super();
    }
	void display() {
     	super.work();
        System.out.println(super.name + " is coding.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Programmer p= new Programmer();
        p.display();
    }
}
