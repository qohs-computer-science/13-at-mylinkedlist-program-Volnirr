public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList list = new MyLinkedList();
    System.out.println("Created new list");

    System.out.println("Size: " + list.size());
    System.out.println("isEmpty: " + list.isEmpty());

    System.out.println("toString: [" + list.toString() + "]");
    System.out.println();

    System.out.println("Adding values to empty list:");
    list.add("First");
    System.out.println("After add('First'): " + list.toString());
    System.out.println();

    MyLinkedList list2 = new MyLinkedList();
    list2.addFirst("AddFirstTest");
    System.out.println("After addFirst('AddFirstTest') on empty list: " + list2.toString());
    System.out.println();
        
    MyLinkedList list3 = new MyLinkedList();
    list3.addLast("AddLastTest");
    System.out.println("After addLast('AddLastTest') on empty list: " + list3.toString());
    System.out.println();
        
    System.out.println("Adding more values to list with existing values:");
    list.add("Second");
    System.out.println("After add('Second'): " + list.toString());
    System.out.println();
        
    list.addFirst("Zero");
    System.out.println("After addFirst('Zero'): " + list.toString());
    System.out.println();
        
    list.addLast("Third");
    System.out.println("After addLast('Third'): " + list.toString());
    System.out.println();
        
    System.out.println("Size: " + list.size());
    System.out.println("isEmpty: " + list.isEmpty());
    System.out.println();
        
    System.out.println("Final toString:");
    System.out.println(list.toString());
    System.out.println();

    System.out.println("Testing get method:");
    System.out.println("get(0) - first: " + list.get(0));
    System.out.println("get(" + (list.size() - 1) + ") - last: " + list.get(list.size() - 1));
    System.out.println("get(2) - middle: " + list.get(2));
    System.out.println();
        
    System.out.println("Testing set method:");
    System.out.println("set(0, 'NewFirst') - returns old value: " + list.set(0, "NewFirst"));
    System.out.println("set(" + (list.size() - 1) + ", 'NewLast') - returns old value: " + list.set(list.size() - 1, "NewLast"));
    System.out.println("set(2, 'NewMiddle') - returns old value: " + list.set(2, "NewMiddle"));
    System.out.println();
        
    System.out.println("toString after set operations:");
    System.out.println(list.toString());
    System.out.println();

    MyLinkedList removeList = new MyLinkedList();
    removeList.add("A");
    removeList.add("B");
    removeList.add("C");
    removeList.add("D");
    removeList.add("E");
        
    System.out.println("Initial list for removal testing:");
    System.out.println(removeList.toString());
    System.out.println("Size: " + removeList.size());
    System.out.println();
      
    System.out.println("Testing remove(int):");
    System.out.println("remove(2) - returns: " + removeList.remove(2));
    System.out.println("After remove(2):");
    System.out.println(removeList.toString());
    System.out.println("Size: " + removeList.size());
    System.out.println();
     
    System.out.println("Testing removeFirst():");
    System.out.println("removeFirst() - returns: " + removeList.removeFirst());
    System.out.println("After removeFirst():");
    System.out.println(removeList.toString());
    System.out.println("Size: " + removeList.size());
    System.out.println();
        
    System.out.println("Testing removeLast():");
    System.out.println("removeLast() - returns: " + removeList.removeLast());
    System.out.println("After removeLast():");
    System.out.println(removeList.toString());
    System.out.println("Size: " + removeList.size());
    System.out.println();
      
    System.out.println("Testing ADD after removals:");
    removeList.add("F");
    removeList.addFirst("Start");
    removeList.addLast("End");
    System.out.println("After adding 'F', 'Start' (first), and 'End' (last):");
    System.out.println(removeList.toString());
    System.out.println("Size: " + removeList.size());
    System.out.println();
        
    System.out.println("Testing get/set after removals:");    
    System.out.println("get(1): " + removeList.get(1));
    System.out.println("set(1, 'Modified') - returns: " + removeList.set(1, "Modified"));
    System.out.println("After set:");
    System.out.println(removeList.toString());
    System.out.println();

    System.out.println("Final size(): " + removeList.size());
    System.out.println("Final isEmpty(): " + removeList.isEmpty());
    System.out.println();
        
    MyLinkedList emptyList = new MyLinkedList();
    System.out.println("Testing removeFirst on empty list: " + emptyList.removeFirst());
    System.out.println("Testing removeLast on empty list: " + emptyList.removeLast());
    System.out.println();
           
    System.out.println("Testing IndexOutOfBoundsException:");
        try {
            list.get(-1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("get(-1) correctly threw IndexOutOfBoundsException");
        }
        
        try {
            list.get(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("get(100) correctly threw IndexOutOfBoundsException");
        }
        
        try {
            list.set(-1, "test");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("set(-1, 'test') correctly threw IndexOutOfBoundsException");
        }
        
        try {
            list.remove(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("remove(100) correctly threw IndexOutOfBoundsException");
        }
    
  } // end main
  
} // end class
