/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final;

/**
 *
 * @author magda
 */
public class Animal {
    void makeSound() {
        System.out.println("Sound From the Parent Class");
    }
    
    void displaycode(){
        System.out.println("""
                           This is how method overriding is coded \n \n public class Animal {
                               void makeSound() {
                                   System.out.println("Sound From the Parent Class");
                               }
                           }public class Dog extends Animal{
                               @Override
                               void makeSound() {
                                   System.out.println("Sound From the Child class");
                               }
                           Expected Output:
                           """);
    }
}
