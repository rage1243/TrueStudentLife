package rtu.mirea.lab2.parts;

import rtu.mirea.lab2.BodyInfo;
import rtu.mirea.lab2.BodyPart;

@BodyInfo(name = "Голова")
public class Head extends BodyPart {
    public Head(String color, short height) {
        super(color, height);
    }

}
