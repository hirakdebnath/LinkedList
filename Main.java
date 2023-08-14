class Main{
    public static void main(String[] args){
        SinglyLinkedList sll= new SinglyLinkedList();
        sll.createsinglylinkedlist(10);
        System.out.println(sll.head.value);
        sll.insertSinglyLinkedList(11, 1);
        sll.insertSinglyLinkedList(12, 0);
        System.out.println(sll.head.next.value);
        System.out.println(sll.head.next.next.value);

    }
}