import java.util.Scanner;

public class MangoTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        System.out.println("Enter tree number :");
        int tree = sc.nextInt();
        if(tree<=cols || tree%cols==1 || tree%cols==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
