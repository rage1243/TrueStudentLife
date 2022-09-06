
package rtu.mirea.lab1;
import rtu.mirea.Lab;

import java.util.Scanner;
import java.lang.*;

public class Lab1 implements Lab {

    public void Run() {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите число, из которого нужно вычислить факториал: ");
        int t = input.nextInt();
        System.out.print("Факториал вашего числа равен: " + factorialGet(t));

    }

    public static int factorialGet(int x) {
        int result = 1;
        for (int i = 1; i <= x; ++i) {
            result *= i;
        }
        return result;
    }
}


