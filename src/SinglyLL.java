public class SinglyLL {
    public static class Node {
        public int data;      
        public Node next;     

        public Node(int data1, Node next1) {
            data = data1;
            next = next1;
        }
        public Node(int data1) {
            data = data1;
            next = null;
        }
    }

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head; 

        for (int i = 1; i < arr.length; i++) {
     
            Node temp = new Node(arr[i]);
            prev.next = temp; 
            prev = temp; 
        }
        return head; 
    }
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; 
        }
        System.out.println();
    }

    private static Node middleNode(Node head) {
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

     public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8,14};
        Node head = convertArr2LL(arr); 
        print(head); 
        Node midNode = middleNode(head);
        System.out.print(midNode.data);
    }
}
