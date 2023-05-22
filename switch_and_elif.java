import java.util.Scanner;
public class switch_and_elif {

    public static void main(String[] args) {

        System.out.println("enter the age");
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();
        if ( age < 18 )
        {
            System.out.println("you are not eligible for driving ");
        } else if (age> 18) {
            System.out.println("you are eligible for driving");

        }
        else {
            System.out.println("become 18");
        }
        System.out.println("enter which type of driving lecense you want to apply")
            ;
            System.out.println("1.car" +
                    "2.bike" +
                    "3.others");
            int d=a.nextInt();

        switch (d) {
            case 1 -> System.out.println("car driving application fomr");
            case 2 -> System.out.println("bike");
            case 3 -> System.out.println("others");
            default -> System.out.println("none");
        }
        }

    }


