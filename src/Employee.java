import java.util.Objects;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private final int id;
    private static int count = 0;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.salary = salary;
        if (department <= 5 && department > 0) {
            this.department = department;
        }else {
            throw new IllegalArgumentException("Такого отдела не существует");
        }
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Сотрудник №" + id +
                "\nФИО - " + name +
                "\nОтдел - " + department +
                "\nЗарплата - " + salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}
