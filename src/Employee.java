import java.util.Objects;

public class Employee {
    private String surName;
    private String name;
    private String middleName;
    private String department;
    private double salary;
    private final long id = count;
    private static long count = 1L;

    public Employee(String surName, String name, String middleName, String department, double salary) {
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        if (Utilit.isDepartment(department)) {
            this.department = department;
        }else {
            System.out.println("Такого отдела нет");
        }
        this.salary = salary;
        count++;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return "Работник №" + id + ", ФИО: " + surName + " " + name + " " + middleName + ", работает в отделе: " + department + ", получает зп: " + String.format("%.2f", salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
