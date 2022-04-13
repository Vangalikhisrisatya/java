/*import java.io.*;
class Student
{
    //member variable declaration
    String Rollno,name,branch,collegeName;
    int year;
    float per_Marks;
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    //Reading an input
    public void getdata()  throws Exception
    {
         System.out.println("Enter Rollno,Name,Branch,CollegeName,year,Percentage");
         Rollno=br.readLine();
         name=br.readLine();
         branch=br.readLine();
         year=Integer.parseInt(br.readLine());
         per_Marks=Float.parseFloat(br.readLine());
         collegeName=br.readLine();
     }
     //Displaying of an information
     public void display()
     {
         System.out.println("Rollnumber:"+Rollno);
         System.out.println("Name:"+name);
         System.out.println("Branch name:"+branch);
         System.out.println("Year:"+year);
         System.out.println("Percentage of Marks:"+per_Marks);
         System.out.println("College Name:"+collegeName);
     }
     public static void main(String args[]) throws Exception
     {
         Student s1=new Student();
         s1.getdata();
         s1.display();
     }
}*/ 
/*import java.io.*;
class Employee
{
    //member variable declaration
    String ename,deptName,companyName,ug,pg;
    int empid;
    float salary;
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    //Reading an input
    public void getPersonal()  throws Exception
    {
         
         ename=br.readLine();
         deptName=br.readLine();
         companyName=br.readLine();
         empid=Integer.parseInt(br.readLine());
         salary=Float.parseFloat(br.readLine());
     }
     public void getQualification() throws Exception
     {
         ug=br.readLine();
         pg=br.readLine();
     }  
     //Displaying of an information
     public void displayPersonal()
     {
         System.out.println("Personal Information");
         System.out.println("Employee ID:"+empid);
         System.out.println("Employee Name:"+ename);
         System.out.println("Department Name:"+deptName);
         System.out.println("Company Name:"+companyName);
         System.out.println("Salary:"+salary);
     }
     public void displayQualification() 
     {
         System.out.println("Qualification Information");
         System.out.println("UG:"+ug);
         System.out.println("PG:"+pg);
     }
     public static void main(String args[]) throws Exception
     {
         Employee e1=new Employee();
         e1.getPersonal();
         e1.getQualification();
         e1.displayPersonal();
         e1.displayQualification();
     }
}*/
/*import java.io.*;
class Box
{
    //member variable declaration
   
    int l,b,h;
   
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    public void getInput()  throws Exception
    {
         l=Integer.parseInt(br.readLine());
         b=Integer.parseInt(br.readLine());
         h=Integer.parseInt(br.readLine());
    }
    public int cal_Area()
    {
        return l*b;
    }
    public int cal_Volume()
    {
        return l*b*h;
    }
    public static void main(String args[]) throws Exception
    {
        Box b1=new Box();
        b1.getInput(); 
        int area=b1.cal_Area();
        int volume=b1.cal_Volume();
        System.out.println("Area of the Box="+area);
        System.out.println("Volume of the Box="+volume);
        Box b2=new Box();
        b2.l=10;
        b2.b=20;
        b2.h=30;
        area=b2.cal_Area();
        volume=b2.cal_Volume();
        System.out.println("Area of the Box="+area);
        System.out.println("Volume of the Box="+volume);  
     }
} */    
//Constructor
/*import java.io.*;
class Sample
{
    int x;
    public Sample()
    {
        System.out.println("Constructor Executed");
        x=10;
    }
    public void show()
    {
        System.out.println(x);
    }
    public static void main(String args[]) throws Exception
    {
        Sample s1=new Sample();
        s1.show();
    }
}*/
/*import java.io.*;
class Sample
{
    int x;
    public Sample()
    {
        System.out.println("Default Constructor");
        x=10;
    }
    public Sample(int y)
    {
        System.out.println("Parameterized Construcor");
        x=y;
    }
    public void show()
    {
        System.out.println(x);
    }
    public static void main(String args[]) throws Exception
    {
        Sample s1=new Sample();
        s1.show();
        Sample s2=new Sample(20);
        s2.show();

    }
}*/
