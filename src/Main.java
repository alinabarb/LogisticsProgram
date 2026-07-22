import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название груза:");
        String product = scanner.nextLine();
        System.out.print("Введите вес груза;");
        double weight = scanner.nextDouble();
        double hubCapacity = 10000.0;
        double balance =  hubCapacity - weight;
        System.out.printf("Груз %s успешно зарегистрирован. Текущий вес: %.2f, осталось свободного места: %.2f ", product, weight, balance);
    }
}