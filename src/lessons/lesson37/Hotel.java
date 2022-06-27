package lessons.lesson37;

public class Hotel extends  LivingPlace{
    private int payment;

    public Hotel(int familyMember, int payment) {
        super(familyMember);
        this.payment = payment;
    }
}
