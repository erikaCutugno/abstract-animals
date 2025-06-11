package org.lessons.animals;

public class Acquila extends AbstractAnimal {

    @Override
    public void makeSound() {
        System.out.println("Verso dell'aquila");
    }

    @Override
    public void eat() {
        System.out.println("Mangia piccoli mammiferi e pesci");
    }

}
