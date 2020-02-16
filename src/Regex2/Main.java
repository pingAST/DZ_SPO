package Regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //DZ1
    // Вывести все строки где, будут удалены ведущие начала,если они совпадают с концом
    public static void main(String[] args) {
        String text = "cat dog fish dog cat\n" +
                      "dog cat fish dog cat\n" +
                      "fish dog cat dog cat\n" +
                      "dog cat fish cat dog \n" +
                      "dog cat fish dog cat";
        Pattern pattern = Pattern.compile("([a-z]+) ([a-z]+) ([a-z]+) ([a-z]+) ([a-z]+)"); //Найти все буквы
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            if (matcher.group(1).equals(matcher.group(5))) {
               System.out.println("    " + matcher.group(2) + " " + matcher.group(3) + " " +  matcher.group(4) + " " + matcher.group(5)) ;
            }
            else {
                System.out.println(  matcher.group(0)) ;
            }

        }

    }
}
