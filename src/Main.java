public class Main {
    private static final Employee[] employees = {
            new Employee("Ивановов Иван Иванович", 1, 10000),
            new Employee("Петров Петр Петрович", 2, 20000),
            new Employee("Сидоров Сидр Сидорович", 3, 30000),
            new Employee("Михайлов Михаил Михайлович", 4, 40000),
            new Employee("Альбертов Альберт Фльбертович", 5, 50000),
            new Employee("Арсланов Арслан Аарсланович", 1, 10000),
            new Employee("Розова Розетта Руслапновна", 1, 10000),
            new Employee("Мухаметова Алия Альбертовнач", 3, 30000),
            new Employee("Давыдова Лариса Владимировна", 4, 40000),
            new Employee("Краснова Екатерина Дмитревна", 5, 50000),


    };

    public static void main(String[] args) {

    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }
    public static Employee FindAnEmployeeWithAMinSalary(){
        Employee employeeWithAMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithAMinSalary.getSalary()){
                employeeWithAMinSalary = employee;
            }
        }
        return employeeWithAMinSalary;
    }
    public static Employee FindAnEmployeeWithAMaxSalary(){
        Employee employeeWithAMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithAMaxSalary.getSalary()){
                employeeWithAMaxSalary = employee;
            }
        }
        return employeeWithAMaxSalary;
    }
    public static float calculateTheAverageValueOfSalaries (){
        return calculateTotalSalary()/(float) employees.length;
    }
    public static void printFullName (){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}