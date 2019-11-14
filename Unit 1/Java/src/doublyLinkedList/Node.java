/*
 * Implementation of Doubly Linked List (DDL) on Java
 * 
 * Oleg Brezitskyy
 * Data Structures and Algorithms
 * 2� Ingenier�a de la Salud
 * Universidad de M�laga
 * 
 */

package doublyLinkedList;

// Doubly Linked List Node
class Node<E> { 
    private E item; 
    private Node<E> prev; 
    private Node<E> next; 

    // Constructor to create a new null node
    public Node() {
    	this.item = null;
    	this.prev = null;
    	this.next = null;
    }
    
    public Node(Node<E> prev, Node<E> next) {
    	this.item = null;
    	this.prev = prev;
    	this.next = next;
    }
    
    // Constructor to create a new node with null prev and next
    public Node(E item) {
           this.item = item;
           prev = next = null;
    }
    
    // Constructor to create a new node
    public Node(E item, Node<E> prev, Node<E> next) {
    	this.prev = prev;
    	this.item = item;
    	this.next = next;
    }
    
    // Get item stored in the node
    public E getItem() {
    	return item;
    }
    
    // Set item of the node
    public void setItem(E item) {
    	this.item = item;
    }
    
    // Get next linked node
    public Node<E> getNext(){
    	return next;
    }
    
    // Get previous linked node
    public Node<E> getPrev(){
    	return prev;
    }
    
    // Set next node
    public Node<E> setNext(Node<E> nextNode) {
    	return this.next = nextNode;
    }
    
    // Set previous node
    public Node<E> setPrev(Node<E> prevNode) {
    	return this.prev = prevNode;
    }
}
