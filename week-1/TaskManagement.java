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
}

class TaskSystem {

    Task head = null;

    public void addTask(int taskId, String taskName, String status) {

        Task newTask = new Task(taskId, taskName, status);

        if (head == null) {
            head = newTask;
        } else {

            Task temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newTask;
        }

        System.out.println("Task Added");
    }


    public Task searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

  
    public void displayTasks() {

        Task temp = head;

        while (temp != null) {

            System.out.println(
                    "ID: " + temp.taskId +
                    ", Name: " + temp.taskName +
                    ", Status: " + temp.status);

            temp = temp.next;
        }
    }

    public void deleteTask(int id) {

        if (head == null) {
            System.out.println("List Empty");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task Deleted");
            return;
        }

        Task temp = head;

        while (temp.next != null) {

            if (temp.next.taskId == id) {

                temp.next = temp.next.next;

                System.out.println("Task Deleted");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }
}

public class TaskManagement {

    public static void main(String[] args) {

        TaskSystem manager = new TaskSystem();

        manager.addTask(
                101,
                "Design UI",
                "Pending");

        manager.addTask(
                102,
                "Write Code",
                "In Progress");

        manager.addTask(
                103,
                "Testing",
                "Pending");

        System.out.println("\nAll Tasks:");

        manager.displayTasks();

        Task t = manager.searchTask(102);

        if (t != null) {

            System.out.println("\nFound Task:");
            System.out.println(t.taskName);
        }

        manager.deleteTask(102);

        System.out.println("\nAfter Deletion:");

        manager.displayTasks();
    }
}