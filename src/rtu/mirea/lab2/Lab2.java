package rtu.mirea.lab2;

import rtu.mirea.Lab;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Lab2 implements Lab {
    public void Run() {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя человека: ");
        String name = input.nextLine();

        System.out.print("Введите возраст человека: ");
        short age = (short)input.nextInt();

        Human human = new Human(name, age);

        for (BodyPart.Parts part : BodyPart.Parts.values()) {
            try {
                String partName = part.getPartType().getAnnotation(BodyInfo.class).name();

                System.out.print("Введите цвет " + partName + ": ");
                String color = input.next();

                System.out.print("Введите высоту " + partName + ": ");
                short height = (short) input.nextInt();

                Constructor<? extends BodyPart> ctor = part.getPartType().getConstructor(String.class, short.class);
                BodyPart bodyPart = ctor.newInstance(color, height);

                human.addBodyPart(part, bodyPart);
            } catch (Exception exception) {
                System.out.println("Переданные значения некорректны: " + exception.getMessage());
            }
        }

        System.out.println();
        System.out.println();
        human.printHumanInformation();

    }
}
