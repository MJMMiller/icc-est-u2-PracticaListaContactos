package models;

public class Node<T> {
    private T value;
    private Node next;

    public Node (T value){
        this.value = value;
        next = null;
    }

    public void setNext(Node<T> node){
        next = node;
    }

    public Node<T> getNext(){
        return next;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    @Override
    public String toString(){
        return "Nodo con valor: " + value;
    }

    
}
