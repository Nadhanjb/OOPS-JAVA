import java.util.*;
import java.util.Scanner;
class StrManipulation
{
public static void main(String[]args)
{
System.out.print("\n--------STRING FUNCTIONS---------");
String s1="Good";
String s2="Morning";
System.out.print("\n\nstring 1 :"+s1);
System.out.print("\nstring 2 :"+s2);
System.out.print("\n\n\n--------STRING LENGTH---------");
System.out.print("\n\nlength of string 'good' :"+s1.length());
System.out.print("\n\n\n--------UPPERCASE---------");
System.out.print("\n\n"+s1+" to uppercase :"+s1.toUpperCase());
System.out.print("\n\n\n--------CONCATENATION---------");
System.out.print("\n\n"+s2+" to lowercase :"+s2.toLowerCase());

System.out.print("\n\n\n--------CONCATENATION---------");
System.out.print("\n\nusing concat() :"+s1.concat(" "+s2));
System.out.print("\n\nusing '+' operator :"+s1+" "+s2);

System.out.print("\n\n\n------CHARACTER EXTRACTION-----");
System.out.print("\n\ncharacter at 3rd position :"+s1.charAt(3));
char c[]=new char[50];
s1.getChars(2,4,c,0);
System.out.print("\n\ncharcater between 2 and 4 :"+new String(c));

System.out.print("\n\n\n-----CHARACTER COMPARISON------");
String x="nadha";
String y="NADHA";
System.out.print("\n\nstring 1 :"+x);
System.out.print("\nstring 2 :"+y);
System.out.print("\n\n"+x+" equals "+y+" :"+x.equals(y));
System.out.print("\n\n"+x+" equals IgnoreCase "+y+" :"+x.equalsIgnoreCase(y));
System.out.print("\n\n"+x+" compare to "+y+" :"+x.compareTo(y));
System.out.print("\n\n"+x+" starts with n  :"+x.startsWith("n"));

System.out.print("\n\n\n-----SEARCH SUBSTRINGS----");
String z="someone told me,You have attractive eyes";

System.out.print("\n\nstring  :"+z);
System.out.print("\n\nindex of 'attractive' word  :"+z.indexOf("attractive"));
System.out.print("\n\nsubstring :"+z.substring(12));
System.out.print("\n\nreplace 'eyes' to 'smile'"+z.replace("eyes","smile"));
System.out.print("\n\n\n-----USING VALUE OF----");
float n=35.87f;
System.out.print("\n\n"+n+" is converted to "+String.valueOf(n));
float p=n+10;
System.out.print("\nsum="+c);
}
}
