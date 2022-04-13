import java.io.*;
class Employee
{
   public static void main(String args[]) throws Exception
   { 
      int emp_id;
      String ename,address;
      float salary;
      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      System.out.println("enter Employee ID,name,salary and address");
      emp_id=Integer.parseInt(br.readLine());
      ename=br.readLine();
      salary=Float.parseFloat(br.readLine());
      address=br.readLine();
      System.out.println("Employee Information");
      System.out.println(emp_id+" "+ename+" "+salary+" "+address);
   }
} 

  