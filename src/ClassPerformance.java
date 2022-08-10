import  java.util.*;
public class ClassPerformance {
    public static double avgOfSubject(int[][] studentMarks,int subjectCode){
        int sum=0;
        for(int i=0;i<15;i++){
            sum=sum+studentMarks[i][subjectCode];
        }
        return (sum/15);

    }
    public static void belowAvgPerformers(int[][] studentMarks){
        System.out.println("Below Average Performance:");
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(studentMarks[i][j]<50){
                    System.out.println("Student"+(i+1)+"Total"+(studentMarks[i][5]));
                    break;
                }
            }
        }

    }
    public static void topPerformers(int[][] studentsMarks,int subjectCode){

        int[][] subjectMarks = new int[15][2];
        for(int i=0;i<15; i++){
            subjectMarks[i][0]=i;
            subjectMarks[i][1]=studentsMarks[i][subjectCode];
        }
        Arrays.sort(subjectMarks, new Comparator<int[]>() {
            @Override
            public int compare(final int[] o1,final int[] o2) {
                if(o1[1]<o2[1])
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println("Top 1 performer in class:"+ (subjectMarks[0][0]+1));
        System.out.println("2nd Top performer in class:"+ (subjectMarks[1][0]+1));
        System.out.println("3rd Top performer in class:"+ (subjectMarks[2][0]+1));
    }
    public static void studentTotal(int[][] studentMarks){
        for(int i=0;i<15;i++){
            System.out.println("Student 1"+ i+" "+studentMarks[i][5]);
        }
    }
    public static void studentRank(int[][] studentMarks){
        int[][] rank = new int[15][2];
        for(int i=0;i<15;i++){
            rank[i][0]=i;
            rank[i][1]=studentMarks[i][5];
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
        int[][] studentMarks = new int[15][6];
        int total = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter Student" + (i + 1) + "marks of five subjects");
            int totalMarks = 0;
            for (int j = 0; j < 5; j++) {
                studentMarks[i][j] = sc.nextInt();
                total += studentMarks[i][j];
                totalMarks += studentMarks[i][j];
            }
            studentMarks[i][5] = totalMarks;
        }
        //Ranking
        studentRank(studentMarks);
        // Total of each
        studentTotal(studentMarks);
        //Top three best performers in each subject
        topPerformers(studentMarks,5);
        //Below avg performers in along with their ranks and in which sub they did poor
        belowAvgPerformers(studentMarks);
        // average of the class performance overall
        System.out.println("Average of the class Performance: " + (total / 15));
        //average of each subject
        System.out.println("Average of Math Marks: "+avgOfSubject(studentMarks,0));
        System.out.println("Average of Computer Science Marks: "+avgOfSubject(studentMarks,1));
        System.out.println("Average of Science Marks: "+avgOfSubject(studentMarks,2));
        System.out.println("Average of Social Science Marks: "+avgOfSubject(studentMarks,3));
        System.out.println("Average of  English Marks: "+avgOfSubject(studentMarks,4));
    }

    }