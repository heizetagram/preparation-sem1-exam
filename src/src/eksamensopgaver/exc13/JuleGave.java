package eksamensopgaver.exc13;

import java.util.Random;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public JuleGave() {
        isSoft = setRandomValue();
        isRectangular = setRandomValue();
        doesRattle = setRandomValue();
    }

    private boolean setRandomValue() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        return randomNumber == 1;
    }

    public boolean couldBeLego() {
        return isSoft && isRectangular && doesRattle;
    }

    public boolean isSoft() {
        return isSoft;
    }
    public boolean isRectangular() {
        return isRectangular;
    }
    public boolean doesRattle() {
        return doesRattle;
    }
}
