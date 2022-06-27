package lessons.lesson37;

public abstract class LivingPlace {
    private int familyMember;
    private String adress;
    public LivingPlace(int familyMember) {
        this.familyMember = familyMember;
    }

    public int getFamilyMember() {
        return familyMember;
    }
}
