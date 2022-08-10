import java.util.*;
import java.io.*;

public class Exceptions {
    public static void arithmetic(){
        int a=5,b=0;
        try
        {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
    public static void nullPointer(){
        String str = null;
        try
        {
            System.out.println(str.length());
        }
        catch (NullPointerException n){
            System.out.println(n.toString());
        }
    }
    public static void fileNotFound(){
        try
        {
            File file = new File("x.txt");
            FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
    }
    public static void classNotFound(){
        try
        {
            Class.forName("Class1");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }


    public static void arrayIndex(){
        try
        {
            int[] array = new int[4];
            int i=array[4];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args)
    {
        Exceptions.arithmetic();
        Exceptions.nullPointer();
        Exceptions.fileNotFound();
        Exceptions.classNotFound();
        Exceptions.arrayIndex();




    }

}
/*
*
* import java.util.Scanner;

class  AgeException extends  Exception{
    public AgeException(){
        super(str);
        String str = "Application is not accepted";

    }
}
public class Application {
    public static void main(String[] args){
        System.out.println("Enter age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age<25)
            throw new AgeException();
            else
                System.out.println("Application accepted");
        }
        catch (AgeException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        };
    }

}
*/
