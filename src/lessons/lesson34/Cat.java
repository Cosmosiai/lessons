package lessons.lesson34;

public class Cat {
    private String name;
    private Integer age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this)return true;
        if (obj instanceof Cat){
            return (((Cat) obj).getName().equals(this.getName())&&((Cat)obj).getAge()==this.getAge());
        }
        return false;
    }
}
