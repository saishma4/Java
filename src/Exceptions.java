import java.util.*;

public class Exceptions {
    public static void arithmetic(){
        int a=5,b=0;
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            //toString()-This method prints Name and description of the Exception
            System.out.println(e.toString());
        }
    }


    public static void main(String[] args)
    {
        Exceptions.arithmetic();



    }

}
