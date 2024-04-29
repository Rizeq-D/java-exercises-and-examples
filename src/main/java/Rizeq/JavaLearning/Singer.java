package Rizeq.JavaLearning;

public class Singer extends Human implements DanceAbility{
    public Singer(String name, int age, String career) {
        super(name, age, career);
    }

    @Override
    public void Speak4urSelf() {
        System.out.println("my name is " + name +
                ", I am " + age +
                ", I work as " + career);
    }

    @Override
    public void isDancer(String yesOrNo) {
        System.out.println(yesOrNo);
    }
}
