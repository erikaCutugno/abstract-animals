package org.lessons.animals;

public class Passerotto extends AbstractAnimal {

    @Override
    public void makeSound() {
        System.out.println("Cip cip");
    }

    @Override
    public void eat() {
        System.out.println("Mangia semi e insetti");
    }

}
