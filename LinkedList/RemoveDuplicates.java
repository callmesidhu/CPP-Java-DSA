package LinkedList;

public class RemoveDuplicates {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }


    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }


    public void removeDuplicates() {
        Node current = head;

        while (current != null) {
            Node runner = current.next;
            while (runner != null) {
                if (runner.data == current.data) {
                    // Remove the duplicate node
                    if (runner.next != null) {
                        runner.next.prev = runner.prev;
                    }
                    if (runner.prev != null) {
                        runner.prev.next = runner.next;
                    }
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }

 
    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(20);
        list.append(40);
        list.append(30);

        list.displayForward();  
        list.displayBackward(); 

        list.removeDuplicates();

       
        list.displayForward();  
        list.displayBackward(); 
    }
}
