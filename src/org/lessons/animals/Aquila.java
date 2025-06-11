package org.lessons.animals;

public class Aquila extends AbstractAnimal implements IVolante {

    @Override
    public void makeSound() {
        System.out.println("Verso dell'aquila");
    }

    @Override
    public void eat() {
        System.out.println("Mangia piccoli mammiferi e pesci");
    }
        @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
