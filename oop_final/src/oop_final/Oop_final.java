/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_final;

import java.util.Scanner; // Move the import statement here

/**
 *
 * @author magda
 */
public class Oop_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        menu1();
    }
    
    public static void menu1(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        
        Animal genericAnimal = new Animal();        
        Animal dog = new Dog();
        methodoverloading overload = new methodoverloading();
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        constructor Constr = new constructor("Juan Dela Cruz", 18);
        overloadingconstructor constructoroverload1 = new overloadingconstructor("This is a plain message");
        overloadingconstructor constructoroverload = new overloadingconstructor("This message used overlaoding constror to print number: ", 6);
           
        encapsulation user = new encapsulation("john_doe", "password123");
        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("* * * * * * * * * * * * Menu * * * * * * * * * * * *");
            System.out.println("1. Method Overriding");
            System.out.println("2. Method Overloading");
            System.out.println("3. Inheritance");
            System.out.println("4. Constructor");
            System.out.println("5. Constructor Overloading");
            System.out.println("6. Encapsulation");
            System.out.println("7. Exit");
            
            System.out.println(" ");
            System.out.print("Enter your choice: ");
            System.out.print(" ");
            
            int choice = scanner.nextInt(); // Corrected line

            switch (choice) {
                case 1:              
                    genericAnimal.displaycode();
                    genericAnimal.makeSound();
                    dog.makeSound();
                    
                    break;
                case 2:
                    overload.displaycode();
                    overload.printmessage("This is a message from method overloading");
                    overload.printmessage("This is a message is overlaoded method to print the numebr: ", 5);
                    System.out.println(" ");
                    break;
                case 3:
                    car.displaycode();
                    vehicle.start();
                    vehicle.stop();
                    System.out.println("");
                    car.start();
                    car.stop();
                    break;
                case 4:
                    Constr.displaycode();
                    Constr.displayinfo();
                    System.out.println(" ");
                    break;
                case 5:
                    constructoroverload1.displayText();
                    constructoroverload.displayInfo();
                    System.out.println(" ");
                    break;
                case 6:
                    user.displaycode();
                    System.out.println("Initial User Information:");
                    user.displayUserInfo();
                    System.out.println(" ");
                    break;          
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    scanner.close();
            }
            break;
        }
    }
}
