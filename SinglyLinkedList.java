public class SinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;
    public Node createsinglylinkedlist(int nodeValue){
        head=new Node();
        tail=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;

    }
    //inset singlyLinkedList
    public void insertSinglyLinkedList(int nodeValue, int location){
        Node node= new Node();
        node.value=nodeValue;
        if(head==null){
            createsinglylinkedlist(nodeValue);
            return;
        }
        else if(location>=size){
        node.next=null;
        tail.next=node;
        tail=node;
        }
       else{
        int index=0;
        Node tempNode=head;
        while(index<location-1){
            tempNode=tempNode.next;
            index++;
        }
        Node nextNode=tempNode.next;
        tempNode.next=node;
        node.next=nextNode;


       }
       size++;
    }
}