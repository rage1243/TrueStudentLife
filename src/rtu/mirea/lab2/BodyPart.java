package rtu.mirea.lab2;


import rtu.mirea.lab2.parts.*;

public abstract class BodyPart {
    public enum Parts {
        HEAD(Head.class),
        NECK(Neck.class),
        BODY(Body.class),
        HANDS(Hands.class),
        LEGS(Legs.class);

        private final Class<? extends BodyPart> partType;
        Parts(Class<? extends BodyPart> partType) {
            this.partType = partType;
        }

        public Class<? extends BodyPart> getPartType() {
            return partType;
        }
    }

    private String color;
    private short height;

    public BodyPart(String color, short height) {
        this.color = color;
        this.height = height;
    }

    public short getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public String getPartName() {
        try {
            return getClass().getAnnotation(BodyInfo.class).name();
        } catch (Exception exception) {
            return "Часть тела";
        }
    }

}
