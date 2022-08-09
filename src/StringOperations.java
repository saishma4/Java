import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();// Saishma Chanda
        String group = sc.nextLine();// cse
        //length of a string
        int len = name.length();
        System.out.println(len);
        //merge two strings
        String merge = name+group;
        System.out.println(merge);
        //split and print the strings
        String[] words = name.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
        //reverse a string
        char ch;
        String rev="";
        for (int i=0;i<name.length();i++){
            ch = name.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
        //Strings are equal
        if(name.equals(group))
            System.out.println("equal");
        else
            System.out.println("Not equal");
    }
}
/*
output:
14
Saishma Chandacse
Saishma
Chanda
adnahC amhsiaS
Not equal

 */