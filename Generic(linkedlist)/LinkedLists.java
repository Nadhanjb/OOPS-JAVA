import java.util.*;
class LinkedLists {
public static void main(String args[]) {
// Create a linked list object.

LinkedList<String> ll = new LinkedList<String>();
// Add elements to the linked list.
ll.add("1");
ll.add("2");
ll.add("3");
ll.add("4");
ll.add("5");
System.out.println("current contents of ll: " + ll);
ll.clear();
System.out.println("Contents of ll after deletion: " + ll);
}
}
