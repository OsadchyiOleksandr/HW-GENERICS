package app;

// Оброблення вхідних даних різного типу
public class DataHandler {
    // Узагальнений нестатичний метод, який має параметр
    // як масив узагальненого типу та повертає String значення
    // обробленого масиву
    public <T> String handleData(T[] items) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        // Цикл обробки масиву узагальненого типу
        for (Object item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString().trim();
    }
}
