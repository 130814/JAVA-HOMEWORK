import java.util.Scanner;
   public class Studentpassonmark
    {
    public static void main(String[] args)
    {
int total,Percentage,english,maths,science;
        Scanner scanner = new Scanner(System.in);

        System.out.println("student name");
        System.out.println("Roll number");
        System.out.println("enter three subject mark");
        english = scanner.nextInt();
        maths = scanner.nextInt();
        science = scanner.nextInt();
        total= english+maths+science;
        Percentage = (total / 300) * 100;


        System.out.println(" Total Marks =  " + total);
        System.out.println(" Marks Percentage =  " + Percentage);

        if(Percentage >= 80)
        {
            System.out.println(" Grade A+");
        }
        else if(Percentage >= 60)
        {
            System.out.println("\n Grade A");
        }
        else if(Percentage >= 50)
        {
            System.out.println("\n Grade B");
        }
        else if(Percentage >= 35)
        {
            System.out.println("\n Grade c");

        }
    }
    }

