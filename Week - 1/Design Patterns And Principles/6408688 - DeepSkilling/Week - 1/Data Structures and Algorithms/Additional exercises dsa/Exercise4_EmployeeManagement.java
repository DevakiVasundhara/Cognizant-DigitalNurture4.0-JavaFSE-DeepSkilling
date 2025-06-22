
class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return employeeId + ": " + name + ", " + position + ", " + salary;
    }
}

public class Exercise4_EmployeeManagement {
    static Employee[] employees = new Employee[100];
    static int count = 0;

    public static void addEmployee(Employee e) {
        employees[count++] = e;
    }

    public static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                employees[i] = employees[--count];
                break;
            }
        }
    }

    public static void displayEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        addEmployee(new Employee(1, "Alice", "Manager", 60000));
        addEmployee(new Employee(2, "Bob", "Engineer", 45000));
        deleteEmployee(1);
        displayEmployees();
    }
}
