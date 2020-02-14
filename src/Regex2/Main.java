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
        Pattern pattern = Pattern.compile("[a-z]*"); //Найти все буквы
        StringBuilder rezult = new StringBuilder();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            rezult.append(text, start, end);
        }
        System.out.println(rezult);
    }
}
