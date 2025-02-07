package Tasks_6;

public class AllTasks {
    public static void main(String[] args) {
                // Task 1
                String city = "Kazan";
                if (city.length() % 2 == 0) {
                    System.out.println("Task 1: Количество символов четное.");
                } else {
                    System.out.println("Task 1: Количество символов нечетное.");
                }
                
                // Task 2
                String word1 = "apple";
                String word2 = "banana";
                if (word1.length() > word2.length()) {
                    System.out.println("Task 2: Первое слово длиннее.");
                } else if (word1.length() < word2.length()) {
                    System.out.println("Task 2: Второе слово длиннее.");
                } else {
                    System.out.println("Task 2: Они одинаковой длины.");
                }
                
                // Task 3
                String city1 = "Moscow";
                String city2 = "Kazan";
                String city3 = "Sochi";
                
                String longest = city1, shortest = city1;
                
                if (city2.length() > longest.length()) longest = city2;
                if (city3.length() > longest.length()) longest = city3;
                
                if (city2.length() < shortest.length()) shortest = city2;
                if (city3.length() < shortest.length()) shortest = city3;
                
                System.out.println("Task 3: Самое длинное название: " + longest);
                System.out.println("Task 3: Самое короткое название: " + shortest);
                
                // Task 4
                String word = "Java";
                int k = 2; // Пример: выводим второй символ
                System.out.println("Task 4: " + word.charAt(k - 1));
                
                // Task 5
                String word5 = "Java";
                if (word5.charAt(1) == word5.charAt(3)) {
                    System.out.println("Task 5: Второй и четвертый символы одинаковы.");
                } else {
                    System.out.println("Task 5: Второй и четвертый символы различны.");
                }
                
                // Task 6
                String word6 = "Java";
                if (word6.charAt(0) == word6.charAt(word6.length() - 1)) {
                    System.out.println("Task 6: Слово начинается и заканчивается на одну и ту же букву.");
                } else {
                    System.out.println("Task 6: Слово не начинается и не заканчивается на одну и ту же букву.");
                }
                
                // Task 7
                String word7a = "Java";
                String word7b = "CSharp";
                if (word7a.charAt(0) == word7b.charAt(word7b.length() - 1)) {
                    System.out.println("Task 7: Первое слово начинается на ту же букву, на которую заканчивается второе.");
                } else {
                    System.out.println("Task 7: Первое слово не начинается на ту же букву, на которую заканчивается второе.");
                }
                
                // Task 8
                String word8 = "Java";
                System.out.println("Task 8: Буквосочетание из второго и четвертого символов: " + word8.charAt(1) + "" + word8.charAt(3));
                
                // Task 9
                String word9 = "JavaScript";
                int middle = word9.length() / 2;
                System.out.println("Task 9: Первая половина слова: " + word9.substring(0, middle));
                
                // Task 10a
                String text = "abc123def45gh6";
                int sum = 0;
                for (char c : text.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sum += Character.getNumericValue(c);
                    }
                }
                System.out.println("Task 10a: Сумма цифр: " + sum);
                
                // Task 10b
                int maxDigit = -1;
                for (char c : text.toCharArray()) {
                    if (Character.isDigit(c)) {
                        int digit = Character.getNumericValue(c);
                        if (digit > maxDigit) {
                            maxDigit = digit;
                        }
                    }
                }
                System.out.println("Task 10b: Максимальная цифра: " + maxDigit);
                
                // Task 11
                StringBuilder digits = new StringBuilder();
                for (char c : text.toCharArray()) {
                    if (Character.isDigit(c)) {
                        digits.append(c);
                    }
                }
                System.out.println("Task 11: Все цифры: " + digits.toString());
                
                // Task 12
                String word12 = "яблоко";
                String block = word12.substring(0, 4);
                String oko = word12.substring(2, 5);
                System.out.println("Task 12: Блок: " + block + ", Око: " + oko);
                
                // Task 13
                String word13 = "информатика";
                String forma = word13.substring(0, 4);
                String tik = word13.substring(7, 10);
                System.out.println("Task 13: Форма: " + forma + ", Тик: " + tik);
                
                // Task 14.1 (без цикла)
                String word14 = "abcdef";
                String swapped14 = word14.substring(word14.length() / 2) + word14.substring(0, word14.length() / 2);
                System.out.println("Task 14.1: Поменяли местами половины: " + swapped14);
                
                // Task 14.2 (с циклом)
                StringBuilder swapped14b = new StringBuilder();
                int mid14 = word14.length() / 2;
                for (int i = mid14; i < word14.length(); i++) {
                    swapped14b.append(word14.charAt(i));
                }
                for (int i = 0; i < mid14; i++) {
                    swapped14b.append(word14.charAt(i));
                }
                System.out.println("Task 14.2: Поменяли местами половины с циклом: " + swapped14b.toString());
                
                // Task 15.1 (без цикла)
                String word15 = "abcdef";
                int k15 = 2;
                String shifted15 = word15.substring(k15) + word15.substring(0, k15);
                System.out.println("Task 15.1: Сдвиг без цикла: " + shifted15);
                
                // Task 15.2 (с циклом)
                StringBuilder shifted15b = new StringBuilder();
                for (int i = k15; i < word15.length(); i++) {
                    shifted15b.append(word15.charAt(i));
                }
                for (int i = 0; i < k15; i++) {
                    shifted15b.append(word15.charAt(i));
                }
                System.out.println("Task 15.2: Сдвиг с циклом: " + shifted15b.toString());
                
                // Task 16
                String club = "Zenit";
                System.out.println("Task 16:");
                for (int i = 0; i < club.length(); i++) {
                    System.out.println(club.charAt(i));
                }
                
                // Task 17
                String word17 = "Java";
                StringBuilder reversed17 = new StringBuilder(word17);
                System.out.println("Task 17: Обратный порядок: " + reversed17.reverse().toString());
                
                // Task 18
                String word18 = "JavaScript";
                StringBuilder oddLetters = new StringBuilder();
                for (int i = 0; i < word18.length(); i += 2) {
                    oddLetters.append(word18.charAt(i));
                }
                System.out.println("Task 18: Нечетные буквы: " + oddLetters.toString());
                
                // Task 19
                String repeatSymbol = "*";
                int repeatCount = 5;
                String repeated = repeatSymbol.repeat(repeatCount);
                System.out.println("Task 19: Повторенные символы: " + repeated);
                
                // Task 20
                String word20 = "Java";
                String result20 = "+" + "+" + "+" + "+" + word20 + "-" + "-" + "-" + "-" + "-";
                System.out.println("Task 20: Результат: " + result20);
                
                // Task 21
                String sentence21 = "The quick brown fox";
                char char1 = 'o';
                char char2 = 'u';
                for (int i = 0; i < sentence21.length(); i++) {
                    if (sentence21.charAt(i) == char1 || sentence21.charAt(i) == char2) {
                        System.out.println("Task 21: Символы '" + char1 + "' и '" + char2 + "' встречаются на позиции: " + i);
                    }
                }
                
                // Task 22
                String sentence22 = "The quick brown fox";
                String target = "nn";
                int count22 = 0;
                for (int i = 0; i < sentence22.length() - 1; i++) {
                    if (sentence22.substring(i, i + 2).equals(target)) {
                        count22++;
                    }
                }
                System.out.println("Task 22: Количество вхождений 'нн': " + count22);
                // Task 22
                String sentence22 = "Это тестовое предложение с буквосочетанием нн.";
                int count_nn = 0;
                for (int i = 0; i < sentence22.length() - 1; i++) {
                    if (sentence22.substring(i, i + 2).equals("нн")) {
                        count_nn++;
                    }
                }
                System.out.println("Task 22: Количество буквосочетаний 'нн' = " + count_nn);
                
                // Task 23
                String text23 = "Здесь есть символы + и *, которые нужно посчитать. + * + *";
                int plusCount = 0, starCount = 0;
                for (char c : text23.toCharArray()) {
                    if (c == '+') plusCount++;
                    if (c == '*') starCount++;
                }
                System.out.println("Task 23: Количество символов '+' = " + plusCount + ", символов '*' = " + starCount);
                
                // Task 24
                String sentence24 = "Этот текст содержит некоторые буквосочетания ро, ро и ро.";
                int count_ro = 0;
                for (int i = 0; i < sentence24.length() - 1; i++) {
                    if (sentence24.substring(i, i + 2).equals("ро")) {
                        count_ro++;
                    }
                }
                System.out.println("Task 24a: Количество буквосочетаний 'ро' = " + count_ro);
                
                String subStr24 = "ро";
                String word = "рококо";
                int countSubstring = 0;
                for (int i = 0; i < word.length() - subStr24.length() + 1; i++) {
                    if (word.substring(i, i + subStr24.length()).equals(subStr24)) {
                        countSubstring++;
                    }
                }
                System.out.println("Task 24b: Количество вхождений подстроки 'ро' = " + countSubstring);
                
                // Task 25
                String sentence25 = "Это пример, который нужно обработать.";
                int commaIndex = sentence25.indexOf(',');
                if (commaIndex != -1) {
                    System.out.println("Task 25: Символы до первой запятой: " + sentence25.substring(0, commaIndex));
                } else {
                    System.out.println("Task 25: Запятая не найдена.");
                }
                
                // Task 26
                String sentence26 = "Здесь есть несколько букв е.";
                int firstE = sentence26.indexOf('е');
                int lastE = sentence26.lastIndexOf('е');
                System.out.println("Task 26a: Порядковый номер первой буквы 'е' = " + firstE);
                System.out.println("Task 26b: Порядковый номер последней буквы 'е' = " + lastE);
                
                // Task 27
                String sentence27 = "Я люблю да, да, да!";
                String updatedSentence = sentence27.replace("да", "не");
                System.out.println("Task 27: Обновленный текст: " + updatedSentence);
                
                // Task 28
                String sentence28 = "Я люблю программирование";
                String newSentence = sentence28.replace("программирование", "кодирование");
                System.out.println("Task 28: Обновленный текст: " + newSentence);
                
                // Task 29
                String word29 = "abcdef";
                int mid = word29.length() / 2;
                String swapped = word29.substring(mid) + word29.substring(0, mid);
                System.out.println("Task 29: Поменяли местами половины: " + swapped);
                
                // Task 30
                String word30 = "abcdefghijklmnop";
                int k = 3;
                int s = 10;
                StringBuilder reversedSub = new StringBuilder(word30.substring(k, s)).reverse();
                String finalWord = word30.substring(0, k) + reversedSub + word30.substring(s);
                System.out.println("Task 30: Текст после изменения: " + finalWord);
                
                // Task 31
                String text31 = "aaabbccccddddd";
                int maxCount = 0, currentCount = 1;
                for (int i = 1; i < text31.length(); i++) {
                    if (text31.charAt(i) == text31.charAt(i - 1)) {
                        currentCount++;
                    } else {
                        maxCount = Math.max(maxCount, currentCount);
                        currentCount = 1;
                    }
                }
                maxCount = Math.max(maxCount, currentCount); // for the last group
                System.out.println("Task 31: Наибольшее количество подряд одинаковых символов: " + maxCount);
                
                // Task 32
                String word32 = "информация";
                String word32Check = "процессор";
                for (int i = 0; i < word32.length(); i++) {
                    System.out.println("Task 32: Буква '" + word32.charAt(i) + "' вторая в слове: " +
                                    (word32Check.indexOf(word32.charAt(i)) != -1 ? "да" : "нет"));
                }
                
                // Task 33
                String sentence33 = "Это десятисловное предложение для задания.";
                String[] words33 = sentence33.split(" ");
                System.out.println("Task 33: Массив из 10 слов:");
                for (String word33 : words33) {
                    System.out.println(word33);
                }
                
                // Task 34
                String sentence34_1 = "Это первое предложение";
                String sentence34_2 = "Это второе предложение";
                String[] words34_1 = sentence34_1.split(" ");
                String[] words34_2 = sentence34_2.split(" ");
                
                for (String word34_1 : words34_1) {
                    System.out.println("Task 34: Слово '" + word34_1 + "' в другом предложении: " +
                                    (sentence34_2.contains(word34_1) ? "да" : "нет"));
                }
            }
    }