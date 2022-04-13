import java.io.*;
class Biker
{
   public static void main(String args[]) throws Exception
   {
       int b1,b2,b3,b4,b5;
       float avg;
       InputStreamReader isr=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(isr);
       b1=Integer.parseInt(br.readLine());
       b2=Integer.parseInt(br.readLine());
       b3=Integer.parseInt(br.readLine());
       b4=Integer.parseInt(br.readLine());
       b5=Integer.parseInt(br.readLine());
       avg=(b1+b2+b3+b4+b5)/5;
       System.out.println(avg);
       if(b1>avg)
       {
          System.out.println("Biker 1 is Qualified in Race "+b1);
       }
       if(b2>avg)
       {
          System.out.println("Biker 2 is Qualified in Race "+b2);
       }
       if(b3>avg)
       {
          System.out.println("Biker 3 is Qualified in Race "+b3);
       }
       if(b4>avg)
       {
          System.out.println("Biker 4 is Qualified in Race "+b4);
       }
       if(b5>avg)
       {
          System.out.println("Biker 5 is Qualified in Race "+b5);
       }
   }
}