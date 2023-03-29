 import java.sql.SQLOutput;
 import java.util.Scanner;

public class Value {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int x and y need to interchange
        System.out.println("enter first number: x ");
        int x = scanner.nextInt();
        System.out.println("second number : y ");
        int y = scanner.nextInt();
        System.out.println("third number : z ");
        int z = scanner.nextInt();
        x=y;
        y=z;
        z=x;

        System.out.println("x= " +x);
        System.out.println("y=" +y);
    }

}