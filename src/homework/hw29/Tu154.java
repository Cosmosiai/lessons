package homework.hw29;

public class Tu154 extends Aircraft{
    public Tu154(String model, boolean type) {
        super(model, type);
    }

    @Override
    public String toString() {
        if (isType()==true){
            return "Tu154{" +
                    "id="+getId()+
                    ", type=civil, "  +
                    "model="+getModel()+
                    '}';
        }else {
            return "Tu154{" +
                    "id="+getId()+
                    ", type=military, "  +
                    "model="+getModel()+
                    '}';
        }
    }
}
