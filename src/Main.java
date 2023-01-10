import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Акулов","Сергей","Дмитриевич","1",73000);
        employees[1] = new Employee("Аулов","Иван","Иванович","3",56000);
        employees[2] = new Employee("Бобров","Борис","Николаевич","1",53000);
        employees[3] = new Employee("Васильев","Василий","Юрьевич","5",50000);
        employees[4] = new Employee("Гусев","Егор","Валентинович","2",57000);
        employees[5] = new Employee("Котов","Петр","Иванович","4",59000);
        employees[6] = new Employee("Гиттер","Александр","Олегович","5",40000);
        employees[7] = new Employee("Галич","Эдуард","Егорович","3",10000);
        employees[8] = new Employee("Сахов","Лев","Александрович","3",35000);
        employees[9] = new Employee("Петров","Алексей","Петрович","5",45000);

        System.out.println("Информация о всех сотрудниках: ");
        printAllEmployees(employees);
        separation();
        calculateSum(employees);
        separation();
        System.out.println("Сотрудник с минимальной зарплатой : ");
        minSalary(employees);
        separation();
        System.out.println("Сотрудник с максимальной зарплатой : ");
        maxSalary(employees);
        separation();
        middleSum(employees);
        separation();
        System.out.println("Ф. И. О. всех сотрудников: ");
        allEmployer(employees);
        separation();


    }
    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static double calculateSum(Employee[] employees) {
        double calculateSum = 0;
        for (int i = 0; i < employees.length; i++) {
            calculateSum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + calculateSum);
        return calculateSum;
    }
    public static double minSalary(Employee[] employees) {
        double minSalary = 100000;
        String nameEpl= null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                nameEpl = employees[i].toString();
            }
        }
        System.out.println(nameEpl);
        return minSalary;
    }
    public static double maxSalary(Employee[] employees) {
        double minSalary = 0;
        String nameEpl = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > minSalary) {
                minSalary = employees[i].getSalary();
                nameEpl = employees[i].toString();
            }
        }
        System.out.println(nameEpl);
        return minSalary;
    }
    public static double middleSum(Employee[] employees) {
        double calculateSum = 0;
        for (int i = 0; i < employees.length; i++) {
            calculateSum += employees[i].getSalary();
        }
        System.out.println("Среднее значение зарплат в месяц: " + calculateSum/employees.length);
        return calculateSum/employees.length;
    }
    public static void allEmployer(Employee[] employee){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].getSurName() + " " + employee[i].getMiddleName());
        }
    }
    public static void separation() {
        System.out.println("_________________________________________________________________________________________");
    }

}