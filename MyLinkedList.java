/*
 * Liam Gillaspy
 * 11/7
 * Class Period: 6
 * A program that creates LinkedLists  
 */ 

public class MyLinkedList
{
    private ListNode head;
    
    
    public MyLinkedList() {
        head = null;
    } // constructor
    
    public int size() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    } // returns size of list
    
    public boolean isEmpty() {
        return head == null;
    } // checks if empty
    
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } // if empty return nothing
        
        String result = "";
        ListNode current = head;
        int index = 0;
        
        while (current != null) {
            result += index + ": " + current.getValue();
            if (current.getNext() != null) {
                result += "\n";
            } // if there is another element send a newline character
            current = current.getNext();
            index++;
        } // loop through the list starting form head and add to a string
        
        return result;
    } // returns a string of the list

    public boolean add(Object newItem) {
        if (isEmpty()) {
            head = new ListNode(newItem, null);
        } else {
            ListNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            } 
            current.setNext(new ListNode(newItem, null));
        } // set current to the last element then setNext to change end
        return true;
    } //adds an element to the end of the list
    
    public boolean addFirst(Object newItem) {
        ListNode newNode = new ListNode(newItem, head);
        head = newNode;
        return true;
    } //adds an alement to the front of the list

    public boolean addLast(Object newItem) {
        return add(newItem);
    } // call add (adds to the end)
    
    public Object get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        } //throw error is OOB
        
        ListNode current = head;
        int index = 0;
        
        while (index < i) {
            current = current.getNext();
            index++;
        } // go through the list until current = i
        
        return current.getValue();
    } // return value at index i
    
    public Object set(int i, Object newValue) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        } // check OOB
        
        ListNode current = head;
        int index = 0;
        
        while (index < i) {
            current = current.getNext();
            index++;
        } // set current = i
        
        Object oldValue = current.getValue();
        current.setValue(newValue);
        return oldValue;
    } //sets val at index i and returns old val
    
    public Object remove(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        } // check OOB
        
        Object removedValue;
        
        if (i == 0) {
            removedValue = head.getValue();
            ListNode temp = head;
            head = head.getNext();
            temp.setNext(null);
        } else {
            ListNode current = head;
            int index = 0;
            
            while (index < i - 1) {
                current = current.getNext();
                index++;
            }
            
            ListNode nodeToRemove = current.getNext();
            removedValue = nodeToRemove.getValue();
            current.setNext(nodeToRemove.getNext());
            nodeToRemove.setNext(null);
        }
        
        return removedValue;
    } // removes val at i and returns val
    
    public Object removeFirst() {
        if (isEmpty()) {
            return null;
        } // make sure it has something in it
        
        Object removedValue = head.getValue();
        ListNode temp = head;
        head = head.getNext();
        temp.setNext(null);
        return removedValue;
    } // removes 1st val and returns
    
    public Object removeLast() {
        if (isEmpty()) {
            return null;
        } // make sure its not empty
        
        if (head.getNext() == null) {
            Object removedValue = head.getValue();
            head = null;
            return removedValue;
        } // if the head is the only element, remove it
        
        ListNode current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        } // loop throuh the find the last element if its not the head
        
        Object removedValue = current.getNext().getValue();
        current.getNext().setNext(null);
        current.setNext(null);
        return removedValue;
    } // remove last val and return
}
