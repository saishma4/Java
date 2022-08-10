import java.util.*;
class AgeException extends Exception{
    AgeException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 25)
                throw new AgeException("Application is rejected for nomination as age is below 25");
            else
                System.out.println("Congratulations! Application is accepted for nomination");
        } catch (Exception e) {
            System.out.println(e);
        }
        ;
    }
}
