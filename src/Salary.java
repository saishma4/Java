import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter working hours:");
        int sun = sc.nextInt();
        int mon = sc.nextInt();
        int tue = sc.nextInt();
        int wed = sc.nextInt();
        int thu  = sc.nextInt();
        int fri = sc.nextInt();
        int sat = sc.nextInt();
        int salary,hrs,bonus=0;
        int s1=0, s2=0,s3=0,s4=0,s5=0,s6=0,s7=0;
        s1=sun*150;
        s7=sat*125;
        if(mon<=8)
            s2=mon*100;
        else if (mon>8)
            s2=800+((mon-8)*115);
        if(tue<=8)
            s3=tue*100;
        else if (tue>8)
            s3=800+((tue-8)*115);
        if(wed<=8)
            s4=wed*100;
        else if (wed>8)
            s4=800+((wed-8)*115);
        if(thu<=8)
            s5=mon*100;
        else if (thu>8)
            s5=800+((thu-8)*115);
        if(fri<=8)
            s6=fri*100;
        else if (fri>8)
            s6=800+((fri-8)*115);
        hrs=mon+tue+wed+thu+fri;
        if(hrs>40) bonus=(hrs-40)*25;

        salary=s1+s2+s3+s4+s5+s6+s7+bonus;
        System.out.println(salary);


    }

    }
