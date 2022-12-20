import java.io.*;
import java.util.*;
class Git_training2
 {
  public static void main(String args[])
   {
    int i,n,sum=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the no.of elements into array:");
    n=s.nextInt();
    int a[]=new int[20];
    System.out.println("Enter the elements into the array:");
    for(i=0;i<n;i++)
     {
      a[i]=s.nextInt();
      sum=sum+a[i];
     }
    System.out.println("The elements present in the array are:");
    for(i=0;i<n;i++)
     {
      System.out.print(a[i]+" ");
     }
    System.out.println("\n The sum of the array elements are:"+sum);
   }
 }