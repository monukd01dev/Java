class Job{
    private int id;
    private String role;
    private long salary;

    //public member functions to access private fields of the class
    //setter and getters
    public void setId(int id) {
        this.id=id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public long getSalary() {
        return salary;
    }
}
class Person{
    private Job job; //entity reference

    public Person(int id, String role, long salary) { // public because it going to access persons private member data
        //I have removed public but still they are working
        job = new Job();
        job.setId(id);
        job.setRole(role);
        job.setSalary(salary);
    }
    public void show(){
        System.out.println(job.getId());
        System.out.println(job.getRole());
        System.out.println(job.getSalary());
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"java dev",2000000l);
        p1.show();
    }
}