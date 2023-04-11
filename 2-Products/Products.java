import java.util.Scanner;

class Product
{
int pCode,price;
String pName;

Product(int pCode,String pName,int price)
{
this.pCode=pCode;
this.pName=pName;
this.price=price;
}
}

class Products
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter product code:");
int pCode=sc.nextInt();
System.out.println("Enter product name:");
String pName=sc.next();
System.out.println("Enter product price:");
int price=sc.nextInt();
  
Product[] ps=new Product[3];
ps[0]=new Product(pCode,pName,price);
ps[1]=new Product(144,"Pen",20);
ps[2]=new Product(145,"Book",50);

int minprice=ps[0].price;
System.out.println("PCode\tPName\tPrice:");
for(Product p:ps)
{
System.out.println(p.pCode+"\t"+p.pName+"\t"+p.price);
if(minprice>p.price)
{
minprice=p.price;
}
}

System.out.println("**************************************");
System.out.println("DETAILS OF PRODUCT THAT HAVE LOW PRICE");
System.out.println("**************************************");
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.println("Product code:"+p.pCode);
System.out.println("Product Name:"+p.pName);
System.out.println("Product pricee:"+p.price);
}
}
}
}
