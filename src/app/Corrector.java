package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (String str : strs) {
            str = correctWord(str); // Викликаємо метод для корегування слова
            stringBuilder.append(count).append(") ").append(str).append("\n");
            count++;
        }
        return stringBuilder.toString();
    }

    // Метод для корегування слова
    private String correctWord(String word) {
        // Ваша логіка корегування слів тут
        // Наприклад, якщо вам потрібно замінити "brange" на "orange", то можете використовувати такий підхід:
        switch (word) {
            case "brange":
                return "orange";
            case "onibn":
                return "onion";
            default:
                return word; // Повертаємо слово без змін, якщо воно не потребує корекції
        }
    }
}