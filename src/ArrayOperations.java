import java.util.*;

public class ArrayOperations {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double[] numbers = new double[size];
        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        double sum=0;
        //mean
        for(int j=0;j<numbers.length;j++){
            sum+=numbers[j];
        }
        sum = sum/numbers.length;
        System.out.println("mean"+sum);

    }
}
