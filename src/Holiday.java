import java.util.*;
public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name , int day, String month) {
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public static boolean inSameMonth(Holiday obj, Holiday obj1){
        return obj.month.equals(obj1.month);
    }
    public static double avgDate(Holiday[] array){
        int sum=0;
        double result;
        for(int i=0;i< array.length;i++){
            sum=sum+array[i].day;
        }
        result=sum/array.length;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Holiday obj = new Holiday("Independence day", 4, "July");
        Holiday obj1 = new Holiday("RakshaBandan", 11, "August");
        Holiday[] array = new Holiday[2];
        array[0] = obj;
        array[1] = obj1;
        System.out.println(Holiday.inSameMonth(obj, obj1));
        System.out.println(Holiday.avgDate(array));


    }
}
