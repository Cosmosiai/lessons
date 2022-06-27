package lessons.lesson34;

public class Animal {
    private String name;
    private String type;
    private Integer age;

    public void voice() {

    }

    public Animal(String name, String type, Integer age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }
}
