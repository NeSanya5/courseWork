public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {

        employee[0] = new Employee("Виноградов Вадим Тимофеевич", 3, 1000);
        employee[1] = new Employee("Самсонов Даниил Сергеевич", 2, 150000);
        employee[2] = new Employee("Шорохов Александр Александрович", 3, 43000);
        employee[3] = new Employee("Тихонова Яна Алексеевна", 5, 6200);
        employee[4] = new Employee("Игнатова Елизавета Фёдоровна", 2, 25000);
        employee[5] = new Employee("Васильев Артур Эмильевич", 1, 7600);
        employee[6] = new Employee("Королев Вадим Львович", 2, 50000);
        employee[7] = new Employee("Калинина Амина Артемьевна", 3, 3700);
        employee[8] = new Employee("Королева Алиса Алексеевна", 2, 5300);
        employee[9] = new Employee("Фролов Даниил Тимофеевич", 4, 6000);
        printEmployee();
        printSumExpensesSalary();
        printEmployeeMinSalary();
        printEmployeeMaxSalary();
        printAverageSalary();
        printName();
    }

    public static void printEmployee() {
        for (Employee emp : employee) {
            System.out.println(emp);
        }
    }

    public static void printSumExpensesSalary() {
        int salary = 0;
        for (Employee emp : employee) {
            salary = salary + emp.getSalary();
        }
        System.out.println("Сумма затрат на зарплату " + salary);
    }

    public static void printEmployeeMinSalary() {
        int salary = employee[0].getSalary();
        int id = 0;
        for (Employee emp : employee) {
            if (emp.getSalary() < salary) {
                salary = emp.getSalary();
                id = emp.getId();
            }
        }
        System.out.println("У " + employee[id].getName() + " самая маленькая зарплата " + employee[id].getSalary());
    }

    public static void printEmployeeMaxSalary() {
        int salary = employee[0].getSalary();
        int id = 0;
        for (Employee emp : employee) {
            if (emp.getSalary() > salary) {
                salary = emp.getSalary();
                id = emp.getId();
            }
        }
        System.out.println("У " + employee[id].getName() + " самая большая зарплата " + employee[id].getSalary());
    }

    public static void printAverageSalary() {
        int salary = 0;
        for (Employee emp : employee) {
            salary = salary + emp.getSalary();
        }
        System.out.println("Средняя зарплата равна "+ salary/ employee.length);
    }


    public static void printName() {
        for (Employee emp : employee) {
            System.out.println(emp.getName());
        }
    }
}