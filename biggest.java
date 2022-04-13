import java.io.*;
class Biggest
{
   public static void main(String args[])
   {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
//BufferedReader br=new BufferedReader(InputStreamReader);
      int a,b;
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
      if(a>b)
      {
          System.out.println("A is biggest");
      }
      else
      {
          System.out.println("B is biggest");
      }
    }
}