package homework.hw29;

public class Boing extends Aircraft{

    public Boing(String model, boolean type ) {
        super(model, type);
    }

    @Override
    public String toString() {
        if (isType()==true){
            return "Boing{" +
                    "id="+getId()+
                    ", type=civil, "  +
                    "model="+getModel()+
                    '}';
        }else {
            return "Boing{" +
                    "id="+getId()+
                    ", type=military, "  +
                    "model="+getModel()+
                    '}';
        }

    }
}
