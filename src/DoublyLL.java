public class DoublyLL {
    public static class Node {
        public int data;      
        public Node next;     
        public Node back;    

        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head; 

        for (int i = 1; i < arr.length; i++) {
     
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp; 
            prev = temp; 
        }
        return head; 
    }
    private static Node deleteHead(Node head){
	if(head == null || head.next == null){
		return null;
	}
	Node prev = head;
	head = head.next;
	head.back = null;
	prev.next = null;
	
	return head;
}
    private static Node deleteTail(Node head){
	if(head == null || head.next == null) {
		return null;
	}
	Node temp = head;
	Node current;
	while(temp.next != null){
		temp = temp.next;
	}
	current = temp.back;
	current.next = null;
	temp.back = null;
	
	return head;
}
   
    private static Node deleteKthNode(Node head,int k) {
       if(head == null) {
		return null;
	}
	int count =0;
	Node temp = head;
	Node front, prev;
	while(temp != null){
		count++;
		if(count == k)
			break;
		temp = temp.next;
	}
	front = temp.next;
	prev = temp.back;
	
	if(prev == null && front == null)
		return null;
	else if(prev == null)
		return deleteHead(head);
	else if(front == null)
		return deleteTail(head);
		
		prev.next = front;
		front.back = prev;
		temp.next = null;
		prev.next = null;
		
	return head;
    }

    // Function to print the elements of the doubly linked list
    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; 
        }
        System.out.println();
    }

     public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};
        Node head = convertArr2DLL(arr); 
        print(head); 
        int k =2;
        
        System.out.println("Doubly Linked List after deleting node "+k+": ");
        head = deleteKthNode(head,k);
        print(head);
    }
}
