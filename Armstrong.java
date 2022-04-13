/*import java.io.*;
class Armstrong
{
   public static void main(String args[]) throws Exception
   {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      int count,sum=0,temp,rem;
      System.out.println("Enter a number:");
      int n=Integer.parseInt(br.readLine());
      count=(int)Math.log10(n)+1;
      temp=n;
      while(n>0)
      {
          rem=n%10;
          sum=sum+(int)Math.pow(rem,count);
          n=n/10;
      }
      if(sum==temp)
      {
         System.out.println(temp+"is Armstrong");
      }
      else
      {
         System.out.println(temp+"is not Armstrong");
      }
   }
}*/
import java.io.*;
class Armstrong
{
   public static void main(String args[]) throws Exception
   {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      int count,sum=0,temp,rem;
      System.out.println("Enter a number:");
      int n=Integer.parseInt(br.readLine());
      count=(int)Math.log10(n)+1;
      temp=n;
      while(n>0)
      {
          rem=n%10;
          //sum=sum*10+(int)Math.pow(rem,count);
          sum=sum*10+rem;
          n=n/10;
      }
      if(sum==temp)
      {
         System.out.println(temp+" is Palindrome");
      }
      else
      {
         System.out.println(temp+" is not Palindrome");
      }
   }
}

      

   
       