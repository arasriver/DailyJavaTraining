package DailyJavaTraining;

public class Animals {
    String name;
    String species;
    int age;

    public Animals(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void makeSound(){
        System.out.println(name + " is singing ");
    }

    public void displayInfo(){
        System.out.println(name + " is a " + species + " has " + age + " years old");
    }


}
