package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
//DZ1
//Дана строка где вперемешку идут буквы и символы
//    Найти все цифры в строке и вывести
//    Найти все буквы в строке и вывести
    public static void main(String[] args) {
	// write your code here
        String text = "aIm9qsQjkOvY4WCE3odRzteb7pwB0yfHM6hurn1GNVU5KLlF8cSix2PTJAgDXZ";
        Pattern pattern = Pattern.compile("\\d"); //Найти все цифры[0-9]
        //Pattern pattern = Pattern.compile("[a-zA-z]"); //Найти все буквы \\D
        StringBuilder rezult = new StringBuilder();
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
            // System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
            rezult.append(text, start, end);
        }
        System.out.println(rezult);
    }
}
