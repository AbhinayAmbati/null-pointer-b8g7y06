class Node
{
    int data;
    Node next;
}

class LinkedList
{
    Node head;
    
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    public void insertAtPos(int data, int pos)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(pos == 0)
        {
            insertAtStart(data);
            return;
        }
        Node n = head;
        for(int i=0;i<pos-1;i++)
        {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }
    public void show()
    {
        Node n = head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    
}


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(14);
        list.insertAtStart(25);
        list.insertAtPos(2,0);
        list.show();
    }
}