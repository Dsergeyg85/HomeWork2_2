import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        //...
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int arraSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxNumberValue = scanner.nextInt();
        logger.log("Создаём и наполняем список ");
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arraSize ; i ++) {
            int randValue = random.nextInt(maxNumberValue);
            builder.append(" ").append(randValue);
            arrayList.add(randValue);
        }
        System.out.println("Вот случайный список:" + builder);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterValue = scanner.nextInt();
        Filter filter = new Filter(filterValue);
        logger.log("Запускаем фильтрацию");
        arrayList = filter.filterOut(arrayList);
        logger.log("Выводим результат на экран");
        builder.setLength(0);
        for (Integer i : arrayList) {
            builder.append(" ").append(i);
        }
        System.out.println("Отфильтрованный список:" + builder);
        logger.log("Завершаем программу");

    }
}