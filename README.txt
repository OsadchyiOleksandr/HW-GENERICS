Протягом 5-ти днів досліджувались показники діяльності магазину. Кожен день встановлювався самий продаваємий товар,
а також загальна сума продажів за день. Реалізуйте функціонал виведення щоденних результатів досліджень,
використовуючи узагальнений метод.

Результат виведення має бути

Products: (1) apple (2) grape (3) mango (4) apple (5) orange
Sales, EUR: (1) 1520.89 (2) 2058.35 (3) 1807.29 (4) 899.99 (5) 1924.25


1) Cтворіть проект Shop-Research на локальній машині через IntelliJ IDEA (IDE).

(2) Структура проекту має бути такою:

(3) Функціонал класу Main

public class Main {

  public static void main(String[] args) {

    DataProvider provider = new DataProvider();
    DataHandler dataHandler = new DataHandler();

    // Обробка масиву даних найменувань товарів
    String namesOutput = dataHandler.handleData(provider.getProductNames());
    getOutput("Products: " + namesOutput);

    // Обробка масиву даних про суми продажів
    String salesOutput = dataHandler.handleData(provider.getSalesAmounts());
    getOutput("Sales, EUR: " + salesOutput);
  }

  // Виведення результату роботи програми
  private static void getOutput(String output) {
    System.out.println(output);
  }
}

(4) Функціонал класу DataProvider

// Надання даних через різний тип масиву
public class DataProvider {

  public String[] getProductNames() {
    return new String[] {"apple", "grape", "mango", "apple", "orange"};
  }

  public Double[] getSalesAmounts() {
    return new Double[] {1520.89, 2058.35, 1807.29, 899.99, 1924.25};
  }
}

(5) Доопрацюйте функціонал класу DataHandler

// Оброблення вхідних даних різного типу
public class DataHandler {
  // Узагальнений нестатичний метод, який має параметр
  // як масив узагальненого типу та повертає String значення
  // обробленого масиву
  public T handleData([] items) {
    StringBuilder sb = new StringBuilder();
    int count = 0;
    // Цикл обробки масиву узагальненого типу
    for (String item : item) {
      count++;
      sb.append(String.format("(%d) %s ", count, item));
    }
    return sb.toString();
  }
}

(6) Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.