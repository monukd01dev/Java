// Parameterize constructor
public class Employee {
    //    instance variable
    int emp_id;
    String emp_name;
    String emp_designation;

    //    parameterize constructor
    Employee(int emp_id, String emp_name, String emp_designation) {
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_designation=emp_designation;
    }
    //     member function
    void display() {

        System.out.println("Employee Details\nName : " + emp_name + "\nID : " + emp_id + "\nDesignation : " + emp_designation + "\n");
    }
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Monu Kumar","Java Developer");
        Employee e2 = new Employee(2, "Diana Jane", "Front-End Developer");
        e1.display();
        e2.display();

    }
}

