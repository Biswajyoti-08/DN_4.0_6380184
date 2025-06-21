class Node {
    public Node next;
    public Task data;

    public Node(Task data) {
        this.data = data;
    }
}

class LinkedList {
    private static Node head = null;
    private static Node tail = null;

    public void add(Task data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty.");
            return;
        }
        while (temp != null) {
            System.out.println("Task ID: " + temp.data.getTaskId() +
                    ", Task Name: " + temp.data.getTaskName() +
                    ", Task Status: " + (temp.data.isStatus() ? "Completed" : "Pending"));
            temp = temp.next;
        }
    }

    public void search(int taskId) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data.getTaskId() == taskId) {
                System.out.println("Found Task ID " + taskId + " at Node hashCode: " + temp.hashCode());
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("Task ID " + taskId + " not found.");
        }
    }

    public void delete(int taskId) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        // Case 1: Deleting head
        if (head.data.getTaskId() == taskId) {
            head = head.next;
            if (head == null) tail = null; 
            System.out.println("Deleted Task ID " + taskId + " from head.");
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.getTaskId() == taskId) {
                temp.next = temp.next.next;
                if (temp.next == null) tail = temp; 
                System.out.println("Deleted Task ID " + taskId);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task ID " + taskId + " not found. Nothing deleted.");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList taskList = new LinkedList();

    
        taskList.add(new Task(1, "Finish Assignment", false));
        taskList.add(new Task(2, "Attend Meeting", true));
        taskList.add(new Task(3, "Workout", false));

        System.out.println("=== Traverse ===");
        taskList.traverse();

        System.out.println("\n=== Search ===");
        taskList.search(2); 
        taskList.search(5);

        System.out.println("\n=== Delete ===");
        taskList.delete(2); 
        taskList.delete(1); 
        taskList.delete(5); 

        System.out.println("\n=== Traverse After Deletion ===");
        taskList.traverse();
    }
}
