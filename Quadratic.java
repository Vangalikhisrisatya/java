import java.io.*;
class Control
{
public static void main(String args[])throws Exception
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
double a,b,c,r1,r2;
System.out.println("Enter a,b,c values in quadratic equation:");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Double.parseDouble(br.readLine());

double d=b*b-4*a*c;
if(d>0){
  r1=(-b+Math.sqrt(d))/(2*a);
  r2=(-b-Math.sqrt(d))/(2*a);
  System.out.printf("r1=%.2f and r2=%.2f",r1,r2);
}
else if(d==0){
  r1=r2=-b/(2*a);
  System.out.format("r1=r2=%.2f",r1);
}
else{
 double real=-b/(2*a);
 double imag=Math.sqrt(-d)/(2*a);
 System.out.format("\n r2=%.2f-%2fi",real,imag);
}
}
}
