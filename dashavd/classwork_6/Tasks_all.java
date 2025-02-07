package Tasks_7;

import java.util.regex.*;

public class Tasks_all {

    public static void main(String[] args) {
        String regex1 = ".*\\d.*";
        String text1 = "Текст с цифрой 123";
        System.out.println("Пример 1: " + text1.matches(regex1));

        String regex2 = "\\(?\\d{3}\\)?[- ]?\\d{3}[- ]?\\d{4}";
        String text2 = "(123) 456-7890";
        System.out.println("Пример 2: " + text2.matches(regex2));

        String regex3 = "\\b\\w+\\b";
        String text3 = "Пример текста с самым длинным словом";
        Matcher matcher3 = Pattern.compile(regex3).matcher(text3);
        String longestWord = "";
        while (matcher3.find()) {
            if (matcher3.group().length() > longestWord.length()) {
                longestWord = matcher3.group();
            }
        }
        System.out.println("Пример 3: Самое длинное слово - " + longestWord);

        String regex4 = "[+-]?\\d+";
        String text4 = "+123";
        System.out.println("Пример 4: " + text4.matches(regex4));

        String regex5 = "^[0-9].*end$";
        String text5 = "123 some text end";
        System.out.println("Пример 5: " + text5.matches(regex5));

        String regex6 = "[+-]?\\d*\\.\\d+";
        String text6 = "-123.45";
        System.out.println("Пример 6: " + text6.matches(regex6));

        String regex7 = "^.{6,}\\?$";
        String text7 = "Hello?";
        System.out.println("Пример 7: " + text7.matches(regex7));

        String regex8 = "^[a-zA-Z].*\\?$";
        String text8 = "Question?";
        System.out.println("Пример 8: " + text8.matches(regex8));

        String regex9 = "^Start.*\\.$";
        String text9 = "Start your task.";
        System.out.println("Пример 9: " + text9.matches(regex9));

        String regex10 = "^[a-zA-Z ]+$";
        String text10 = "Hello World";
        System.out.println("Пример 10: " + text10.matches(regex10));

        String regex11 = "^[A-Z].*!$";
        String text11 = "Hello!";
        System.out.println("Пример 11: " + text11.matches(regex11));

        String regex12 = "^[a-zA-Z].*done$";
        String text12 = "Task done";
        System.out.println("Пример 12: " + text12.matches(regex12));

        String regex13 = "^Hello there.*!$";
        String text13 = "Hello there, how are you!";
        System.out.println("Пример 13: " + text13.matches(regex13));

        String regex14 = "^\\d+done$";
        String text14 = "123done";
        System.out.println("Пример 14: " + text14.matches(regex14));

        String regex15 = "^[a-zA-Z]\\d+.*complete$";
        String text15 = "Task123 complete";
        System.out.println("Пример 15: " + text15.matches(regex15));

        String regex16 = "^#.*done$";
        String text16 = "#task done";
        System.out.println("Пример 16: " + text16.matches(regex16));

        String regex17 = "^ .+exit$";
        String text17 = " please exit";
        System.out.println("Пример 17: " + text17.matches(regex17));

        String regex18 = "^[a-z].*done$";
        String text18 = "task done";
        System.out.println("Пример 18: " + text18.matches(regex18));

        String regex19 = ".*[A-Z].*";
        String text19 = "Hello World";
        System.out.println("Пример 19: " + text19.matches(regex19));
    }
}
