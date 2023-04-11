import java.util.Scanner;

class Matrix{
public static void main(String[] args)
{
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows:");
int m=sc.nextInt();
System.out.println("Enter number of colunms:");
int n=sc.nextInt();
  

int[][] mat1=new int[m][n];
int[][] mat2=new int[m][n];
int[][] summat=new int[m][n];


System.out.println("Enter first matrix:");

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
mat1[i][j]=sc.nextInt();

}

}

System.out.println("Enter second matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
mat2[i][j]=sc.nextInt();
}
}

//for addition

for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
summat[i][j]=mat1[i][j]+mat2[i][j];
}
}

System.out.println("sum of two matrix:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(summat[i][j]+"\t");

}
System.out.println();
}

}
}
