import java.io.*;
class Vibgyor
{
 public static void main(String args[]) throws Exception
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  char ch;
  System.out.println("Enter a colour code:");
  ch=(char)br.read();
  switch(ch)
  {
    case 'V':System.out.println("Violet");
             break;
    case 'I':System.out.println("Indigo");
             break;
    case 'B':System.out.println("Blue");
             break;
    case 'G':System.out.println("Green");
             break;
    case 'Y':System.out.println("Yellow");
             break;
    case 'O':System.out.println("Orange");
             break;
    case 'R':System.out.println("Red");
             break;
    case 'v':System.out.println("Violet");
             break;
    case 'i':System.out.println("Indigo");
             break;
    case 'b':System.out.println("Blue");
             break;
    case 'g':System.out.println("Green");
             break;
    case 'y':System.out.println("Yellow");
             break;
    case 'o':System.out.println("Orange");
             break;
    case 'r':System.out.println("Red");
             break;
    default:
        System.out.println("Invalid Colour Code");
    }
   }
}  