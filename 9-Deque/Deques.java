import java.util.*;
public class Deques
{
public static void main(String[]args)
{
//initializing Deque object
Deque<String>deque=new ArrayDeque<String>();
//adding values
deque.add("A");
deque.add("B");
deque.add("C");
deque.add("D");
deque.add("E");
System.out.println("Elements in que are: ");
for(String str:deque)
{
System.out.println(str +"");
}
deque.remove();
System.out.println("\nAfter deletion of first element :");
for(String str:deque)
{
System.out.println(str +"");
}
deque.clear();
System.out.println("\nAfter deletion of all element : ");
for(String str:deque)
{
System.out.println(str +"");
}
}
}
