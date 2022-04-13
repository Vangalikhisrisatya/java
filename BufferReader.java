import java.io.*;
class BufferReader
{
   public static void main(String args[]) throws Exception
   {
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
//BufferedReader br=new BufferedReader(InputStreamReader);
      int P,T,R;
      P=Integer.parseInt(br.readLine());
      T=Integer.parseInt(br.readLine());
      R=Integer.parseInt(br.readLine());
      float I;
      I=P*T*R/100;
      System.out.println(I);
    }
}
 