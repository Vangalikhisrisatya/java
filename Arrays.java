//Compiletime initialisation
/*class Array1
{
    public static void main(String args[])
    {
         int x[]={10,20,30,40};
         for(int i=0;i<x.length;i++)
         {
             System.out.println(x[i]);
         }
     }
}*/
/*class Array1
{
    public static void main(String args[])
    {
         int x[]=new int[10];
             System.out.println(x[10]);
         
     }
}*/
//Runtime initialisation
/*import java.io.*;
class Array1
{
   public static void main(String args[]) throws Exception
   {
        int x[],n,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array:");
        n=Integer.parseInt(br.readLine());
        x=new int[n];
        System.out.println("Enter the "+n+" elements");
        for(i=0;i<n;i++)
        {
             x[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Elements in the array are:");
        for(int ele:x)
             System.out.println(ele);
   }
}*/
/*import java.io.*;
class Array1
{
   public static void main(String args[]) throws Exception
   {
        int x[],E[],O[],n,i=0,j=0,k=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of an array:");
        n=Integer.parseInt(br.readLine());
        x=new int[n];
        E=new int[n];
        O=new int[n];
        System.out.println("Enter the "+n+" elements");
        for(i=0;i<n;i++)
        {
             x[i]=Integer.parseInt(br.readLine());
        }
        for(int ele:x)
        { 
             if(ele%2==0)
             {
                 E[j++]=ele;
             }
             else
             {
                 O[k++]=ele;
             }
        }
        System.out.println();
        for(i=0;i<j;i++)
              System.out.println(E[i]+" ");
        System.out.println();
         for(i=0;i<k;i++)
              System.out.println(O[i]+" ");
        
        
   }
}*/
/*import java.io.*;
class Array1
{
   public static void main(String args[]) throws Exception
   {
        int x[],n,i,max,min;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the salary of the employees:");
        n=Integer.parseInt(br.readLine());
        x=new int[n];
        System.out.println("Enter the "+n+" elements");
        for(i=0;i<n;i++)
             x[i]=Integer.parseInt(br.readLine());
        
        min=x[0];
        max=x[0];
        System.out.println();
        for(int ele:x)
        {
            if(min>ele)
               min=ele;
            if(max<ele)
               max=ele;
        }
        
        System.out.println("Maximun Salary:"+max);
        System.out.println("Minimum Salary:"+min);
        
    }
 }*/
import java.io.*;
class Array1
{
   public static void main(String args[]) throws Exception
   {
        int x[],n,i,j,count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the salary of the employees:");
        n=Integer.parseInt(br.readLine());
        x=new int[n];
        System.out.println("Enter the "+n+" elements");
        for(i=0;i<n;i++)
             x[i]=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        {
            if(x[i]!=-1)
            {
               count=0;
               for(j=i+1;j<n;j++)
               {
                  if(x[i]==x[j])
                  {
                     count++;
                     x[j]=-1;
                  }
              }
           }
           System.out.println();
           if(count==0)
              System.out.println(x[i]);
        }
    }
}
                
        
        