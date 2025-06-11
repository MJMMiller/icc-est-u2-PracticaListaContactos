package models;

public class LinkedList <T> {

    private Node<T> head;
    private int size;
    private Node<T> tail;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void appendTail(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public T findByValue(T value){
        Node<T> valor = head;
        while(valor != null){
            if(valor.getValue().equals(value)){
                return valor.getValue();
            }
            valor = valor.getNext();
        }
        return null;
    }

    public void deleteByValue(T value){
        Node<T> valor = head;
        Node<T> anterior = null;
        while(valor != null){
            if (valor.getValue().equals(value)) {
                if (anterior == null) {
                    head = valor.getNext();
                } else {
                    anterior.setNext(valor.getNext());
                }
            }
            anterior = valor;
            valor = valor.getNext();
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print(){
        Node<T> valor = head;
        while(valor != null){
            System.out.print(valor.getValue() + " | ");
            valor = valor.getNext();
        }
        System.out.println();
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
