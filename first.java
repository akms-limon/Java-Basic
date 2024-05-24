import java.util.Scanner;

/**
 * first
 */
public class first {

    public static void main(String[] args) {
        String name;
        System.out.println("This is my first program");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        System.out.println("Given name is : " + name);

        int a, b; 
        a = s.nextInt();
        b = s.nextInt();
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }
}