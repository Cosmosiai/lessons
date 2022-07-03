package homework.hw2_4;

public class Keyboard {
    private String[] letters;
    private boolean backlights;
    private boolean extraKeys;

    public Keyboard(String[] letters, boolean backlights, boolean extraKeys) {
        this.letters = letters;
        this.backlights = backlights;
        this.extraKeys = extraKeys;
    }

    public String[] getLetters() {
        return letters;
    }

    public boolean isBacklights() {
        return backlights;
    }

    public boolean isExtraKeys() {
        return extraKeys;
    }

    public void setLetters(String[] letters) {
        this.letters = letters;
    }

    public void setBacklights(boolean backlights) {
        this.backlights = backlights;
    }

    public void setExtraKeys(boolean extraKeys) {
        this.extraKeys = extraKeys;
    }
}
