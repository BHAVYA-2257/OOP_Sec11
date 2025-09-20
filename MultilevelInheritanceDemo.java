package inheitanceMultilevel;

class Employee {
    void show() {
        System.out.println("I am an employee.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Managing the team.");
    }
}

class ProjectManager extends Manager {
    void projectPlanning() {
        System.out.println("Planning the project.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager();
        pm.show();
        pm.manage();
        pm.projectPlanning();
    }
}
