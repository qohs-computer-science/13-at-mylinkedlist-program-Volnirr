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

  } // end main
  
} // end class
