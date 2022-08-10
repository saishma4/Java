import java.sql.Wrapper;
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



    }
}