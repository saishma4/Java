import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.print("Collatz Sequence for "+num+" : ");
        while(num !=1) {
            System.out.print(num+" ");
            if (num % 2 == 0)
                num = num / 2;
            else
                num = 3 * num + 1;
        }
        System.out.println(num);
    }
}
