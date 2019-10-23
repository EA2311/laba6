package onpu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        System.out.println("Please, enter a string containing only latin alphabet: ");
        str = scan.nextLine();
        UpperCase up = new UpperCase();
        LowerCase low = new LowerCase();
        System.out.println("The number of uppercase letter: " + up.analyse(str));
        System.out.println("The number of lowercase letter: " + low.analyse(str));
    }
}

interface StringAnalyse{
    int analyse(String str);
}

class UpperCase implements StringAnalyse{
    int number=0;
    public int analyse(String str){
        for(int i =0;i<str.length();i++)
            if(Character.isLetter(str.charAt(i))&&Character.isUpperCase(str.charAt(i))) {
                number++;
            }
        return number;
    }
}

class LowerCase implements StringAnalyse{
    int number=0;
    public int analyse(String str){
        for(int i =0;i<str.length();i++)
            if(Character.isLetter(str.charAt(i))&&Character.isLowerCase((str.charAt(i)))) {
                number++;
            }
        return number;
    }
}