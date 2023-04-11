class Cpus{
   int price=40000;
   class processor{
     int noOfcores=5;
     String manufacture="Ryzen AMD";
       void display(){
              System.out.println("---PROCESSOR DETAILS---\n");
              System.out.println("No of cores:"+noOfcores);
              System.out.println("Manufacture:"+manufacture);
          }
    }
    void display(){
        processor p=new processor();
         p.display();
         System.out.println("Price:"+price);
   }

    static class RAM{
       int memory=8;
       String manufacture="nexgen rigs";
    void display(){
        System.out.println("\n---RAM DETAILS---\n");
        System.out.println("Memmory:"+memory);
        System.out.println("Manufacture:"+manufacture);
   }
 }
}
public class Cpu{
   public static void main(String [] args){
       Cpus c1=new Cpus();
       c1.display();


     Cpus.RAM r1=new Cpus.RAM();
      r1.display();
}
}
