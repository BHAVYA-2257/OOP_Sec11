package inheritanceMultiple;

interface Skill1 {
    void skill1();
}

interface Skill2 {
    void skill2();
}

class Employee {
    void displayRole() {
        System.out.println("Generic Employee Role");
    }
}

class TechLead extends Employee implements Skill1, Skill2 {
    public void skill1() {
        System.out.println("Leading with Skill1");
    }

    public void skill2() {
        System.out.println("Leading with Skill2");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        TechLead lead = new TechLead();
        lead.displayRole();
        lead.skill1();
        lead.skill2();
    }
}
