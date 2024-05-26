public class Main {
    private static final Employee[] employees = {
            new Employee("Ивановов Иван Иванович", 1, 10000),
            new Employee("Петров Петр Петрович", 2, 20000),
            new Employee("Сидоров Сидр Сидорович", 3, 30000),
            new Employee("Михайлов Михаил Михайлович", 4, 40000),
            new Employee("Альбертов Альберт Фльбертович", 5, 51000),
            new Employee("Арсланов Арслан Аарсланович", 1, 11000),
            new Employee("Розова Розетта Руслапновна", 1, 12000),
            new Employee("Мухаметова Алия Альбертовнач", 3, 30000),
            new Employee("Давыдова Лариса Владимировна", 4, 40000),
            new Employee("Краснова Екатерина Дмитревна", 5, 50000),


    };

    public static void main(String[] args) {
        printEmployees();
        printSeparator();
        System.out.println("Сумма всех зарплат: " + calculateTotalSalary());
        printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой: " + FindAnEmployeeWithAMinSalary());
        printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой:" + FindAnEmployeeWithAMaxSalary());
        printSeparator();
        System.out.println("средняя зарплата: " + calculateTheAverageValueOfSalaries());
        printSeparator();
        printFullName();
        String line1 = "9Madam, I'm Adam!9";
        String line2 = "Пионы";
        System.out.println(isPalindrom(line2));

    }

    public static void printSeparator() {
        System.out.println("___________________________________________________________________________________________________________________________________");
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static float calculateTotalSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    public static Employee FindAnEmployeeWithAMinSalary() {
        Employee employeeWithAMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < employeeWithAMinSalary.getSalary()) {
                employeeWithAMinSalary = employee;
            }
        }
        return employeeWithAMinSalary;
    }

    public static Employee FindAnEmployeeWithAMaxSalary() {
        Employee employeeWithAMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > employeeWithAMaxSalary.getSalary()) {
                employeeWithAMaxSalary = employee;
            }
        }
        return employeeWithAMaxSalary;
    }

    public static float calculateTheAverageValueOfSalaries() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", "")).reverse().toString());
    }

    public static Boolean isPalindrom(String text) {
        String leftRight = "";
        String rightLeft = "";
        char[] arr0 = text.toCharArray();
        for (int I = 0; I <= arr0.length - 1; I++) {
            if (Character.isLetterOrDigit(arr0[I]) == false) {
                I++;
            }
            leftRight += arr0[I];
        }
        leftRight = leftRight.replace(" ", "");
        char[] arr1 = leftRight.toCharArray();
        char[] arr2 = new char[arr1.length];
        for (int i = arr1.length - 1; i > 0; ) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = arr1[i];
                i--;
                rightLeft += arr2[j];
            }
        }
        System.out.println(text);
        System.out.println(leftRight);
        System.out.println(rightLeft);
        return leftRight.equalsIgnoreCase(rightLeft);
    }
}