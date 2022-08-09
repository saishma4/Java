import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        int[] marks = new int[0];
        Scanner sc = new Scanner(System.in);
        int max=0,min=0;
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        //finding max
        for(int j=0;j<marks.length;j++) {
            if (marks[j]> max)
                max=marks[j];

        }

        //finding min
        for(int k = 0; k <marks.length; k++){
            if(marks[k]<min)
                min=marks[k];
        }
        System.out.println("maximum"+min);
    }

    }