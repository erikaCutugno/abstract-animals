package org.lessons.animals;

public class Delfino extends AbstractAnimal implements INuotante {

    @Override
    public void makeSound() {
        System.out.println("Verso del delfino");
    }

    @Override
    public void eat() {
        System.out.println("Mangia pesci");
    }
    
        @Override
    public void nuota() {
        System.out.println("Sto nuotando!");
    }
}
