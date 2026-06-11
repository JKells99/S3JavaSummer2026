package musicstore.usermanagnment;

public class Employee extends Person{

    private int salary;
    private String position;
    private String department;

    public Employee(int id, String name, String address, String phone, int salary, String position, String department) {
        super(id, name, address, phone);
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("salary=").append(salary);
        sb.append(", position='").append(position).append('\'');
        sb.append(", department='").append(department).append('\'')
                .append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
