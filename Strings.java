//program which reads a line of text and then prints word number,and the no.of.characters in it
/*import java.io.*;
class Strings
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String input;
input=br.readLine();
String words[]=input.split(" ");
for(int i=0;i<words.length;i++)
{
System.out.println("word"+(i+1)+"-"+words[i].length());
}
}
}*/

//Program which takes two strings and checks whether the string was embeeded or not
/*import java.io.*;
class Strings
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s1,s2;
s1=br.readLine();
s2=br.readLine();

if(s1.contains(s2))
  System.out.println("YES");
else
  System.out.println("NO");
}
}*/
//string methods
/*import java.io.*;
class Strings
{
      public static void main(String args[])throws Exception
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String str1;
          int i,l=0,u=0,d=0,s=0;
          str1=br.readLine();
          char ch[]=str1.toCharArray();
          for(i=0;i<ch.length;i++)
          {
                if(Character.isLowerCase(ch[i]))
                      l++;
                else if(Character.isUpperCase(ch[i]))
                      u++;
                else if(Character.isDigit(ch[i]))
                      d++;
                else
                      s++;
          }
          System.out.println(l+" "+u+" "+d+" "+s);
       }
} */
//write a program to remove characters in the given string except alphabets
/*import java.io.*;
class Strings
{
     public static void main(String args[])throws Exception
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String str1,str2=" ";
          int i;
          str1=br.readLine();
          char ch[]=str1.toCharArray();
          for(i=0;i<ch.length;i++) 
          {
              if(Character.isDigit(ch[i])) 
                     // str2=str2+ch[i];
                     //sum=sum+Integer.parseInt(ch[i]+" ");
                     sum=sum+(ch[i]-48);
          }
          System.out.println(str2);
    }
}*/  
/*import java.io.*;
class StringBuffer_Demo
{
     public static void main(String args[])throws Exception
     {
         StringBuffer s1=new StringBuffer();
         System.out.println(s1.capacity());
         System.out.println(s1.length());
         s1.append("abcdefghijklmnop");
         System.out.println(s1.capacity());
         System.out.println(s1.length());
         StringBuffer s1=new StringBuffer("Welcome");
         System.out.println(s2.CharAt(4));
         s2.setChar(4,'a');
         System.out.println(s2);
         s2.deleteChar(4,'a');
         System.out.println(s2);
         System.out.println(s1.length());
         StringBuffer s1=new StringBuffer("Welcome");
      }
}*/
import java.io.*;
class String_Reverse
{
    public static void main(String args[])throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String str1;
         StringBuffer sb1;
         str1=br.readLine();
         String words[]=str1.split(" ");
         for(int i=0;i<words.length;i++)
         {
               sb1=new StringBuffer(words[i]);
               System.out.print(sb1.reverse()+" ");
         }
    }
}  
   
     