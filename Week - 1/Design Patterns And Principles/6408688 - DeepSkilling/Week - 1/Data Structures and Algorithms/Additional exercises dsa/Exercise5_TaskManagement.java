
class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    @Override
    public String toString() {
        return taskId + ": " + taskName + " [" + status + "]";
    }
}

public class Exercise5_TaskManagement {
    static Task head = null;

    public static void addTask(Task t) {
        if (head == null) head = t;
        else {
            Task current = head;
            while (current.next != null) current = current.next;
            current.next = t;
        }
    }

    public static void deleteTask(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }
        Task current = head;
        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }
        if (current.next != null) current.next = current.next.next;
    }

    public static void displayTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        addTask(new Task(1, "Design", "Pending"));
        addTask(new Task(2, "Develop", "In Progress"));
        deleteTask(1);
        displayTasks();
    }
}
