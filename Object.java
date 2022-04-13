//how to access objects in a class
class Object
{
   int x=10,y=20;
   public static void show()
   {
       System.out.println("Good Evening");
   }
   public void display()
   {
       System.out.println("Good Morning");
   }
   public static void main(String args[])
   {
       Object obj=new Object();
       obj.display();
       show();
       System.out.println("Welcome");
       System.out.println(obj.x);
       System.out.println(obj.y);
   }
}