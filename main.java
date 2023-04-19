import java.util.*;

public class main
{
    public static void main(String args[])
    {
        int add , subtract , multi  ;
        float division , modulo;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        
        
        System.out.println("Enter the button number from the below listed button: 1");
        int button = sc.nextInt();
        




        switch(button) {
            case 1: System.out.println("You Choosed Addition");
                add = a + b;
                System.out.println(add);
                break;

                case 2: System.out.println("You Choosed Subtraction");
                subtract = a - b;
                System.out.println(subtract);
                break;

                case 3: System.out.println("You Choosed Multiplication");
                multi = a * b;
                System.out.println(multi);
                break;

                case 4: System.out.println("You Choosed Division");
                division = a / b;
                System.out.println(division);
                break;

                case 5: System.out.println("You Choosed Modulo");
                modulo = a % b;
                System.out.println(modulo);
                break;
                
        
            default: System.out.println("Invalid Button");
                break;
        }
    }
}