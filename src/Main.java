public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
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
        printEmployee(employee);
        printSumExpensesSalary(employee);
        printEmployeeMinSalary(employee);
        printEmployeeMaxSalary(employee);
        printAverageSalary(employee);
        printName(employee);
    }

    public static void printEmployee(Employee employee[]) {
        for (int i = 0; i <= employee.length - 1; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void printSumExpensesSalary(Employee employee[]) {
        int salary = 0;
        for (int i = 0; i <= employee.length - 1; i++) {
            salary = salary + employee[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату " + salary);
    }

    public static void printEmployeeMinSalary(Employee employee[]) {
        int salary = employee[0].getSalary();
        int id = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < salary) {
                salary = employee[i].getSalary();
                id = i;
            }
        }
        System.out.println("У " + employee[id].getName() + " самая маленькая зарплата " + employee[id].getSalary());
    }

    public static void printEmployeeMaxSalary(Employee employee[]) {
        int salary = employee[0].getSalary();
        int id = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > salary) {
                salary = employee[i].getSalary();
                id = i;
            }
        }
        System.out.println("У " + employee[id].getName() + " самая большая зарплата " + employee[id].getSalary());
    }

    public static void printAverageSalary(Employee employee[]) {
        int salary = 0;
        for (int i = 0; i < employee.length-1; i++) {
            salary = salary + employee[i].getSalary();
        }
        System.out.println("Средняя зарплата равна "+ salary/ employee.length);
    }


    public static void printName(Employee employee[]) {
        for (int i = 0; i <= employee.length - 1; i++) {
            System.out.println(employee[i].getName());
        }
    }
}