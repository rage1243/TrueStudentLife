package rtu.mirea;

import rtu.mirea.lab1.Lab1;
import rtu.mirea.lab2.Lab2;

import java.util.Scanner;

public class Program {
    private static final Lab[] labs = {
            new Lab1(),
            new Lab2()
    };

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Введите номер лабораторной работы: ");
            int selectLab = input.nextInt();
            labs[selectLab - 1].Run();
        } catch (Exception exception) {
            System.out.println("Номер лабораторной работы некорректен: " + exception.getMessage());
        }
    }
}
