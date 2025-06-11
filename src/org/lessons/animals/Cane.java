package org.lessons.animals;

public class Cane extends AbstractAnimal {

    @Override
    public void makeSound() {
        System.out.println("Bau bau");
    }

    @Override
    public void eat() {
        System.out.println("Mangia carne e croccantini");
    }

}
