import java.util.*;
public class Main {
    public static void main(String[] args) {
        double balance = 10000.0;
        String product;
        double weight;
        String answer = "Y";
        Scanner scanner = new Scanner(System.in);
        while(answer.equals("Y")){
            System.out.print("Введите название груза:");
            product = scanner.nextLine();
            System.out.print("Введите вес груза:");
            weight = scanner.nextDouble();
            scanner.nextLine();//Метод nextDouble() считывает только цифры, оставляя символ нажатия клавиши Enter (перенос строки) в системе.
            balance -= weight;
            if(balance>=0) {
                System.out.printf("Груз %s успешно зарегистрирован. Текущий вес: %.2f, осталось свободного места: %.2f ", product, weight, balance);
            }
            else
            {
                balance += weight;
                System.out.printf("Груз %s не зарегистрирован по причине превышения веса. Осталось свободного места: %.2f ", product, balance);
            }

            System.out.print("\nПродолжить регистрацию? (Y/N)");
            answer = scanner.nextLine();
        }
    }
}