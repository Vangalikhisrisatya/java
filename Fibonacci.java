/*import java.io.*;
class Fibonacci
{
   public static void main(String args[]) throws Exception
   {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      int f1=0,f2=1,f3;
      System.out.println("Enter a range:");
      int n=Integer.parseInt(br.readLine());
      System.out.print(f1+" "+f2+" ");
      for(int i=3;i<=n;i++)
      {
         f3=f1+f2;
         f1=f2;
         f2=f3;
      
      System.out.print(f3+" ");
      }
    }
}*/
import java.io.*;
class Fibonacci
{
   public static void main(String args[]) throws Exception
   {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      int f1=0,f2=1,f,sum=0;
      System.out.println("Enter a range:");
      int n=Integer.parseInt(br.readLine());
      System.out.print(f1+" "+f2+" ");
      f=f1+f2;
      while(f<=n)
      {
          if(f%2==0) 
              sum=sum+f;
          f1=f2;
          f2=f;
          System.out.print(f+" ");
          f=f1+f2;
      }
      System.out.println("Sum of even numbers is "+sum);  
   }
}  