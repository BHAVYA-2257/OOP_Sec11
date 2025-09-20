package inheritanceHierarchical;

class Employee {
    void attendMeeting() {
        System.out.println("Employee attending a meeting.");
    }
}

class Programmer extends Employee {
    void writeCode() {
        System.out.println("Writing code.");
    }
}

class Tester extends Employee {
    void testCode() {
        System.out.println("Testing code.");
    }
}

class HR extends Employee  {
    void conductInterview() {
        System.out.println("Conducting interviews.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Programmer prog = new Programmer();
        prog.attendMeeting();
        prog.writeCode();

        Tester tester = new Tester();
        tester.attendMeeting();
        tester.testCode();

        HR hr = new HR();
        hr.attendMeeting();
        hr.conductInterview();
    }
}
