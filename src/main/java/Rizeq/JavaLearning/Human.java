package Rizeq.JavaLearning;


public abstract class Human {
        String name;
        int age;
        String career;

    public Human(String name, int age, String career) {
            this.name = name;
            this.age = age;
            this.career = career;

        }
        public abstract void Speak4urSelf();
    }


