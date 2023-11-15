import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение количества записей в словаре
        int n = scanner.nextInt();
        scanner.nextLine(); // Считывание символа новой строки

        // Создание словаря
        Map<String, String> dictionary = new HashMap<>();

        // Чтение записей и заполнение словаря
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" - ");
            String word = parts[0];
            String description = parts[1];
            dictionary.put(word, description);
        }

        // Чтение запроса
        String query = scanner.nextLine();

        // Поиск описания значения в словаре
        String description = dictionary.getOrDefault(query, "Нет в словаре");

        // Вывод результата
        System.out.println(description);

        scanner.close();
    }
}