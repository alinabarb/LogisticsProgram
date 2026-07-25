import java.util.*;
public class Main {
    public static void main(String[] args) {
        double balance = 10000.0;
        String product;
        double weight;
        String answer = "Y";
        String[] journal = new String[5];
        int product_id = 0;
        Scanner scanner = new Scanner(System.in);
        while(answer.equals("Y") ){
            System.out.print("Введите название груза:");
            product = scanner.nextLine();
            System.out.print("Введите вес груза:");
            weight = scanner.nextDouble();
            scanner.nextLine();//Метод nextDouble() считывает только цифры, оставляя символ нажатия клавиши Enter (перенос строки) в системе.
            balance -= weight;
            if(balance>=0) {
                System.out.printf("Груз %s успешно зарегистрирован. Текущий вес: %.2f, осталось свободного места: %.2f ", product, weight, balance);
                journal[product_id] = product;
                product_id++;
            }
            else
            {
                balance += weight;
                System.out.printf("Груз %s не зарегистрирован по причине превышения веса. Осталось свободного места: %.2f ", product, balance);
            }
            if(product_id<5) {
                System.out.print("\nПродолжить регистрацию? (Y/N)");
                answer = scanner.nextLine();
            }
            else answer = "N";
        }
        System.out.println("\nИтоговый список товаров:");
        for(String products:journal) {
            if(products!=null) {
                System.out.println(products);
            }
        }

    }
}