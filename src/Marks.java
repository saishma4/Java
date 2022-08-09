import java.util.Scanner;

public class Marks {
    public static void main(String[] args){
        int[] marks = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        int max=0,min=marks[0];
        //finding max
        for(int j=0;j<marks.length;j++){
            if(marks[j]>max)
                max=marks[j];
        }
        System.out.println();
        //finding min
        for(int k=0;k<marks.length;k++){
            if(marks[k]<min)
                min=marks[k];

        }
        System.out.println(min);
    }
}
