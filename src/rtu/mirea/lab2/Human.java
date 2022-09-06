package rtu.mirea.lab2;
import rtu.mirea.lab2.parts.Body;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class Human {
    private String name;
    private short age;

    private Map<BodyPart.Parts, BodyPart> bodyParts = new HashMap<BodyPart.Parts, BodyPart>();

    public Human(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public short getHumanAge() { return age; }
    public String getHumanName() { return name; }

    public int calculateHumanHeight() {
        int headHeight = getBodyPart(BodyPart.Parts.HEAD).getHeight();
        int neckHeight = getBodyPart(BodyPart.Parts.NECK).getHeight();
        int bodyHeight = getBodyPart(BodyPart.Parts.BODY).getHeight();
        int legHeight = getBodyPart(BodyPart.Parts.LEGS).getHeight();

        return headHeight + neckHeight + bodyHeight + legHeight;
    }

    public BodyPart getBodyPart(BodyPart.Parts partType) {
        return bodyParts.get(partType);
    }

    public void addBodyPart(BodyPart.Parts partType, BodyPart part) {
        bodyParts.put(partType, part);
    }

    public void printHumanInformation() {
        System.out.println("Имя человека: " + getHumanName());
        System.out.println("Возраст человека: " + getHumanAge());
        System.out.println("Рост человека: " + calculateHumanHeight());

        for (Map.Entry<BodyPart.Parts, BodyPart> entry : bodyParts.entrySet()) {
            System.out.println("Часть тела: " + entry.getValue().getPartName());
            System.out.println("\tДлина: " + entry.getValue().getHeight());
            System.out.println("\tЦвет: " + entry.getValue().getColor());
        }
    }

}

