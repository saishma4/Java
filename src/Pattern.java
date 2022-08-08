import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines and Charecters:");
        int lines = sc.nextInt();
        char x=sc.next().charAt(0);
        char y=sc.next().charAt(0);
        for(int i=0;i<lines;i++){
            for(int j=0;j<=i;j++){
                System.out.print(x+" ");
            }
            for(int j=0;j<lines-i;j++){
                System.out.print(y+" ");
            }
            System.out.println();
                }
            }
        }
        /*for(int i=lines; i>0;i++){
            for(int j=0;j<1;j++){
                System.out.println("*");
            }
        }*/
        /*while(i<=lines){
            System.out.println("x");
            i++;
        }
        while(i>=0){
            System.out.print("#");
            i--;
        }*/