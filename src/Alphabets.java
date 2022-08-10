import java.util.*;

public class Alphabets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String modified="";
        for(int i=0;i<sentence.length();i++){
            if(Character.isUpperCase(sentence.charAt(i)))
                modified+=Character.toLowerCase(sentence.charAt(i));
            else
                modified+=Character.toUpperCase(sentence.charAt(i));
        }
        System.out.println(modified);
    }
}
