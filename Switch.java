import java.io.*;
class Switch
{
 public static void main(String args[]) throws Exception
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  char ch;
  ch=(char)br.read();
  switch(ch)
  {
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
       System.out.println("Vowel");
       break;
    default:
        System.out.println("Consonant");
    }
   }
}  

    
