import java.io.*;
class FactDiff
{
 public static void main(String args[]) throws Exception
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  int prod=1,sum=0,a,i;
  System.out.println("Enter a number:");
  a=Integer.parseInt(br.readLine());
  for(i=1;i<=a;i++)
  {
     if(a%i==0)
     {
         prod=prod*i;
         sum=sum+i;
     }
  }
  System.out.println("Difference is"+(prod-sum));
 }
}