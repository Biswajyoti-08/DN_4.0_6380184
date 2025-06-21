public class Main {
    private static final int MAX_EMPLOYEES = 100;
    private static Employee[] employees = new Employee[MAX_EMPLOYEES];
    private static int count = 0;

private static void addEmployee(int id, String name, String position, double salary) {
        if (count >= MAX_EMPLOYEES) {
            System.out.println("Employee list is full.");
            return;
        }
        employees[count++] = new Employee(id, name, position, salary);
        System.out.println("Employee added: " + name);
    }

    private static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                printEmployee(employees[i]);
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }

    private static void traverseEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            printEmployee(employees[i]);
        }
    }

    private static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Deleted employee with ID: " + id);
                return;
            }
        }
        System.out.println("Employee not found with ID: " + id);
    }

    private static void printEmployee(Employee emp) {
        System.out.println("ID: " + emp.getEmployeeId()
                + ", Name: " + emp.getName()
                + ", Position: " + emp.getPosition()
                + ", Salary: " + emp.getSalary());
    }
        public static void main(String[] args) {

      
        System.out.println("Adding employee...");
        addEmployee(101, "John Doe", "Developer", 70000);

     
        System.out.println("\nSearching for employee with ID 101...");
        searchEmployee(101);

      
        System.out.println("\nTraversing all employees...");
        traverseEmployees();

        System.out.println("\nDeleting employee with ID 101...");
        deleteEmployee(101);

  
        System.out.println("\nTraversing all employees after deletion...");
        traverseEmployees();
    }

    
}
