import java.util.Scanner;
class Temp
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        if(a<0)
        System.out.println("Freezing Weather");
        else if(a>=0 && a<10)
        System.out.println("Very cold Weather");
        else if(a>=10 && a<20)
        System.out.println("Cold Weather");
        else if(a>=20 && a<30)
        System.out.println("Normal Weather");
        else if(a>=30 && a<40)
        System.out.println("Hot Weather");
        else
        System.out.println("Very hot Weather");
     }
}






    