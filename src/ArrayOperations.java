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
        double mean;
        //mean
        for(int j=0;j<numbers.length;j++){
            sum+=numbers[j];
        }
        mean = sum/numbers.length;
        System.out.println("mean  "+mean);
        //median
        Arrays.sort(numbers);
        int len = numbers.length;
        double median;
        if(len%2!=0)
            median=numbers[len/2];
        else
            median=(numbers[(len-1)/2]+numbers[len/2])/2.0;
        System.out.println("median  "+median);

        //mode
        double mode =3*(median)-2*(mean);
        System.out.println("mode "+mode);

    }
}
