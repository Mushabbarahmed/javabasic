import java.util.Scanner;
public class taking_input{
    public static void main (String[] args)
    {
        Scanner s=new Scanner (System.in);
        // taking integer input
        System.out.print("enter a number");
        int a =s.nextInt();
        System.out.println(a);

        // taking string using next which print only one word
        System.out.print("enter a string");
        String str=s.next();
        System.out.println(str);

        //taking string using nextline which prints whole line(string)
        // here while using nextline u have to use another nexrline because it skips nextline method when used after any next statemnets
        System.out.println("enter a  whole string\n");
        String str12=s.nextLine();
        String str1=s.nextLine();
        System.out.println(str1);

        //checking if it has integer value using hasnextint
        System.out.print("enter");
        boolean b1=s.hasNextInt();
        System.out.println(b1);

    }

}
