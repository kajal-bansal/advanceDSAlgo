import ListNode

public class LinkedList{
    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if(head==null){return 0;}
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count
    }
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head==null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst(){
        if (head==null){ return null;}
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if(head==null || head.next== null){
            // head = null;
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!= null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    public static void main(String args[]){
        LinkedList sll = new LinkedList();
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(9);
        sll.display();

    }

}
