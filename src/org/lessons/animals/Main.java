package org.lessons.animals;

public class Main {
    public static void main(String[] args) {
     Cane cane = new Cane();
     Delfino delfino = new Delfino();
     Passerotto passerotto = new Passerotto(); 
     Aquila aquila = new Aquila();

     System.out.println("Cane:");
     cane.makeSound();
     cane.eat();
     cane.sleep();
     
     System.out.println("Delfino:");
     delfino.makeSound();
     delfino.eat();
     delfino.sleep();
    
     System.out.println("Passerotto:");
     passerotto.makeSound();
     passerotto.eat();
     passerotto.sleep();
     
     System.out.println("Aquila:");
     aquila.makeSound();
     aquila.eat();
     aquila.sleep();
     

     faiVolare(aquila);
     faiNuotare(delfino);
     faiVolare(passerotto);
    }
    static void faiVolare(IVolante animale) {
        animale.vola();
    }

    static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

}
