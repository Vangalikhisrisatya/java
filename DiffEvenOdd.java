import java.io.*;
class DiffEvenOdd
{
   public static void main(String args[]) throws Exception
   {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      int sume=0,sumo=0,r;
      System.out.println("Enter a number:");
      int n=Integer.parseInt(br.readLine());
      while(n>0)
      {
          r=n%10;
          if(r%2==0)
          {
              sume=sume+r;
          }
          else
          {
              sumo=sumo+r;
          }
          n=n/10;
       }
       System.out.println(+Math.abs(sume-sumo));
    }
}
