package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {

    private String name;
    public String getName() {
        return name;
    }


    private static int hitCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount =  1 + (int) (Math.random() * 4);
       // hitCount = hitCount + 1;

        if (hitCount == 1) {
            hitCount = 0;
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            hitCount = 0;
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        }  else if (hitCount == 4) {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;

        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount =  1 + (int) (Math.random() * 4);
        //hitCount = hitCount + 2;

        if (hitCount == 1) {
            hitCount = 0;
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            hitCount = 0;
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 0;
            defencedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            hitCount = 0;
            defencedBodyPart = BodyPart.CHEST;
        }
        return defencedBodyPart;
    }
}
