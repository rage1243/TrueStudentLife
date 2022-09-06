package rtu.mirea.lab2.parts;

import rtu.mirea.lab2.BodyInfo;
import rtu.mirea.lab2.BodyPart;

@BodyInfo(name = "Туловище")
public class Body extends BodyPart {
    public Body(String color, short height) {
        super(color, height);
    }
}
