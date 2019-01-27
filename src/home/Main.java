package home;

import home.polimorfizm.Animal;
import home.polimorfizm.Cat;
import home.polimorfizm.Dog;

public class Main {
    public static void main(String[] args) {


        Dog pies1 = new Dog();
        pies1.dajGłos();

        Cat kot1 = new Cat();
        kot1.dajGłos();

        pies1.poruszajSie();
        kot1.poruszajSie();

        Animal zwierzePies = new Dog();

        pies1.zjedzCoZnajdziesz();

        zwierzePies.poruszajSie();


        Animal zwierzeKot = new Cat();

        zwierzeKot.poruszajSie();
    }
}
