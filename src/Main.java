public class Main {
    static Employee[] employee = new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Виноградов Вадим Тимофеевич", 3, 9999);
        employee[1] = new Employee("Самсонов Даниил Сергеевич", 2, 150000);
        employee[2] = new Employee("Шорохов Александр Александрович", 3, 43000);
        employee[3] = new Employee("Тихонова Яна Алексеевна", 5, 6200);
        employee[4] = new Employee("Игнатова Елизавета Фёдоровна", 2, 250000);
        employee[5] = new Employee("Васильев Артур Эмильевич", 1, 7600);
        employee[6] = new Employee("Королев Вадим Львович", 2, 50000);
        employee[7] = new Employee("Калинина Амина Артемьевна", 3, 3700);
        employee[8] = new Employee("Королева Алиса Алексеевна", 2, 530000);
        employee[9] = new Employee("Фролов Даниил Тимофеевич", 4, 600000);
        printEmployeeSalaryLessThanNumbe(100000);

    }

    public static void printEmployee() {
        for (Employee emp : employee) {
            System.out.println(emp);
        }
    }

// сумма затрат на зартплату в целом и отделе
    public static void printSumExpensesSalary() {
        int salary = 0;
        for (Employee emp : employee) {
            salary = salary + emp.getSalary();
        }
        System.out.println("Сумма затрат на зарплату " + salary);
    }
    public static void printSumExpensesSalaryInDepartment(int department) {
        int salary = 0;
        for (Employee emp : employee) {
            if (department == emp.getDepartment()) {
                salary = salary + emp.getSalary();
            }
        }
        System.out.println("В отделе " + department + "Сумма затрат на зарплату " + salary);
    }

    // мин зп в целом и отдел
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
    public static void printEmployeeMinSalaryInDepartment(int department) {
        int salary = 999999999;
        int id = 0;
        for (Employee emp : employee) {
            if (emp.getSalary() < salary && department == emp.getDepartment()) {
                salary = emp.getSalary();
                id = emp.getId();
            }
        }
        System.out.println("В отделе " + department +
                " У " + employee[id].getName() +
                " самая маленькая зарплата " + employee[id].getSalary());
    }

    //максимальная зп в целом и отдел
    public static void printEmployeeMaxSalary() {
        int salary = 0;
        int id = 0;
        for (Employee emp : employee) {
            if (emp.getSalary() > salary) {
                salary = emp.getSalary();
                id = emp.getId();
            }
        }
        System.out.println("У " + employee[id].getName() + " самая большая зарплата " + employee[id].getSalary());
    }
    public static void printEmployeeMaxSalaryInDepartment(int department) {
        int salary = 1;
        int id = 0;
        for (Employee emp : employee) {
            if (emp.getSalary() > salary && department == emp.getDepartment()) {
                salary = emp.getSalary();
                id = emp.getId();
            }
        }
        System.out.println("В отделе " + department +
                "У " + employee[id].getName() +
                " самая маленькая зарплата " + employee[id].getSalary());
    }

    // средняя зп в целом и отдел
    public static void printAverageSalary() {
        int salary = 0;
        for (Employee emp : employee) {
            salary = salary + emp.getSalary();
        }
        System.out.println("Средняя зарплата равна " + salary / employee.length);
    }
    public static void printAverageSalaryInDepartment(int department) {
        int salary =0;
        int employeeDepartment = 0;
        for (int i = 0; i < employee.length-1;) {
            if (employee[i].getDepartment() != department) {
                i++;
            } else {
                salary = salary + employee[i].getSalary();
                i++;
                employeeDepartment++;
            }
        }
        System.out.println("Средняя зарплата по отделу " + department+ " равна " + salary / employeeDepartment);
    }
    //все сотрудники в целом и отделе
    public static void printName() {
        for (Employee emp : employee) {
            System.out.println(emp.getName());
        }
    }
    public static void printNameInDepartment(int department) {
        for (Employee emp : employee) {
            if (department == emp.getDepartment()){
                System.out.println("\nФИО - " + emp.getName() +
                        "\nЗарплата - " + emp.getSalary());
            }
        }
    }

    public static void addArgumentToSalary(int argument) {
        for (Employee emp : employee) {
            emp.setSalary(emp.getSalary() + (emp.getSalary() * argument / 100));
            System.out.println(emp.getName() + " " + emp.getSalary());
        }
    }
    //Все сотрудники с зп меньше числа
    public static void printEmployeeSalaryLessThanNumbe (int namber){
        for (Employee emp : employee) {
            if (emp.getSalary() < namber){
                System.out.println("\nСотрудник № " + emp.getId() +
                        "\nФИО - " + emp.getName() +
                        "\nЗарплата - " + emp.getSalary());
            }
        }
    }
    // Все сотрудникb с зп больше (или равно) числа
    public static void printEmployeeSalaryMoreThanNumbe (int namber){
        for (Employee emp : employee) {
            if (emp.getSalary() >= namber){
                System.out.println("\nСотрудник № " + emp.getId() +
                        "\nФИО - " + emp.getName() +
                        "\nЗарплата - " + emp.getSalary());
            }
        }
    }
}