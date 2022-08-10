import  java.util.*;
public class ClassPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[15][5];
        int[] total = new int[15];
        for (int i = 0; i < 15; i++) {
            int totalMarks = 0;
            for (int j = 0; j < 5; j++) {
                students[i][j] = sc.nextInt();
                totalMarks += students[i][j];
            }
            total[i] = totalMarks;
        }
        //Ranking
        // Total of each
        for (int j = 0; j < 15; j++) {
            System.out.println(j + 1 + " " + total[j]);

            // average of the class performance overall
            int sum = 0;
            for (int i = 0; i < total.length; i++) {
                sum += total[i];
            }
            System.out.print(sum / 15);
            //average of each subject
            int subSum=0;
            for(int s=0;s<5;s++){
                for(int t=0;t<15;t++) {
                    subSum+=students[t][s];
                }
                int subAvg=subSum/15;
            }

        }

    }
}