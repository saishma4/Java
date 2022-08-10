import  java.util.*;
public class ClassPerformance {
    public static void topPerformers(int[][] students,int subjectCode){

        int[][] subjectMarks = new int[15][2];
        for(int i=0;i<15; i++){
            subjectMarks[i][0]=i;
            subjectMarks[i][1]=students[i][subjectCode];
        }
        Arrays.sort(subjectMarks, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });
    }
    public static void belowAvgPerformers(int[][] students){
        System.out.println("Below Average Performance:");
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(students[i][j]<50){
                    System.out.println("Student"+(i+1)+"Total"+(students[i][5]));
                    break;
                }
            }
        }

    }

    public static void studentTotal(int[][] students){
        for(int i=0;i<15;i++){
            System.out.println("Student 1"+ i+" "+students[i][5]);
        }
    }
    public static void studentRank(int[][] students){
        int[][] rank = new int[15][2];
        for(int i=0;i<15;i++){
            rank[i][0]=i;
            rank[i][1]=students[i][5];
        }
        Arrays.sort(rank, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1, final int[] o2) {
                if(o1[1]<o2[1])
                    return 1;
                else
                    return -1;
            }
        });
        for(int i=0;i<15;i++){
            System.out.println("rank"+(i+1)+"  Student"+(rank[i][0]+1));
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[15][6];
        int total = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter Student" + (i + 1) + "marks of five subjects");
            int totalMarks = 0;
            for (int j = 0; j < 5; j++) {
                students[i][j] = sc.nextInt();
                total += students[i][j];
                totalMarks += students[i][j];
            }
            students[i][5] = totalMarks;
        }
        //Ranking
        studentRank(students);
        // Total of each
        studentTotal(students);
        //Top three best performers in each subject
        topPerformers(students,0);
        //Below avg performers in along with their ranks and in which sub they did poor
        belowAvgPerformers(students);
        // average of the class performance overall
        System.out.println("Average of the claa Performance: " + (total / 15));
        //average of each subject

    }

    }