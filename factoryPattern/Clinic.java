package factoryPattern;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        PetRecord petFile = new PetRecord();
        Pet pet;

        // instantiate dog and cat objects to access NoOfLives and Breed
        Dog dog = new Dog(); // edited by chryzanths
        Cat cat = new Cat(); // edited by chryzanths

        // set boolean (useful for boolean expression in while loop)
        boolean exit = false; // edited by chryzanths

        do { // edited by chryznth

            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit"); // edited by chryzanths
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    dog.setBreed("German Shepperd"); // edited by chryzanths
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    cat.setNoOfLives(9); // edited by chryzanths
                    break;

                // when '3' is entered, it will print out "Exited" + boolean expression changes in to 'true' and will terminate code
                // edited by chryzanths
                case 3:
                    System.out.println("Exited");
                    exit = true;
                    break;
            }

            // if-else will print out different statements based on corresponding input
            if (choice == 1){ // edited by chryzanths
                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                System.out.println("Breed: " + dog.getBreed()); // edited by chryzanths
                System.out.println(); // edited by chryzanths
            }
            else if (choice == 2){ // edited by chryzanths
                System.out.println("Pet id is " + petFile.getPetId());
                System.out.println("Pet name is " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                System.out.println("Number of lives: " + cat.getNoOfLives()); // edited by chryzanths
                System.out.println(); // edited by chryzanths
            }


        // while exit=false, then the code inside do-loop will continue printing out
        } while (!exit); // edited by chryzanths


    }

}

