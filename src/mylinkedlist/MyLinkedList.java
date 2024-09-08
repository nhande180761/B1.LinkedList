/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylinkedlist;

/**
 *
 * @author DELL
 */
public class MyLinkedList {
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void add(int data, int index){
        Node newNode = new Node(data);
        if (index == 0){
            addFirst(data);
            return;
        }else {
            Node temp = head;
            for (int i = 1; i < index-1; i++){
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }

    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void deleteFirst(){
        if (head == null){
            return;
        }
        head = head.next;
    }


    //Buoi 3
    // void delete(int index)
    // void deleteLast()
    // boolean search()
    //Node search(int index)
    // Node maxNode()
    // Node minNode()
    // void sortByPositionToAndEnd(int to, int end)

    public void deleteLast(){
        if (head == null){
            return;
        }
        if (head.next == null){
            deleteFirst();
        }
        Node temp = head;
        Node previous = null;
        while (temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
    }

        public void delete(int index){
            if (index == 0){
                deleteFirst();
                return;
            }else if (index == length() - 1){
                deleteLast();
                return;
            } else {
                Node preNodeDelete = head;
                for (int i = 1; i < index; i++){
                    preNodeDelete = preNodeDelete.next;
                }
                preNodeDelete.next = preNodeDelete.next.next;
            }
        }

    public boolean search(int data){
        if (head == null){
            return false;
        }
        Node temp = head;
        while (temp != null){
            if (temp.getData() == data){
                return true;
            }
        }
        return false;
    }

    public Node searchAtPosition(int index){
        if (index == 0 || index >= length()){
            return null;
        }
        Node temp = head;
        for (int i = 1; i <= index; i++){
            temp = temp.next;
        }
        return temp;
    }




    // BTVN1: Viết hàm delete theo while. Hint: dùng count++.
    // BTVN2: Viết hàm sort()
    public void sort(){
        boolean isSwap;
        if (head == null || head.next == null){
            return ;
        }
        for(Node i = head; i != null; i = i.next){
            isSwap = false;
            for (Node j = i.next; j != null; j = j.next ){
                if (i.data < j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) break;
        }
    }
    // BTVN3: Giải thích

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        linkedList.delete(4);
        linkedList.display();
    }
}
