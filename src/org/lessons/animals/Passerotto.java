package org.lessons.animals;

public class Passerotto extends AbstractAnimal implements IVolante {

    @Override
    public void makeSound() {
        System.out.println("Cip cip");
    }

    @Override
    public void eat() {
        System.out.println("Mangia semi e insetti");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
