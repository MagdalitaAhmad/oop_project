/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final;

/**
 *
 * @author magda
 */
public class Car extends Vehicle{
    public void start() {
        System.out.println("Toyota Car is Starting");
    }

    public void stop() {
        System.out.println("Toyota Car is Stoppping.");
    }
    
    void displaycode(){
        System.out.println(" This is how inheritance is coded: \n \n"
                + "public class Vehicle {\n" +
"    public void start() {\n" +
"        System.out.println(\"Starting\");\n" +
"    }\n" +
"\n" +
"    public void stop() {\n" +
"        System.out.println(\"The has stopped.\");\n" +
"    }\n" +
"}"
                + ""
                + "public class Car extends Vehicle{\n" +
"    public void start() {\n" +
"        System.out.println(\"Toyota Car is Starting\");\n" +
"    }\n" +
"\n" +
"    public void stop() {\n" +
"        System.out.println(\"Toyota Car is Stoppping.\");\n" +
"    }\n" +
"    "
                + "public class Main {\n" +
"    public static void main(String[] args) {\n" +
"        // Create an instance of the Car class\n" +
"        Car toyotaCar = new Car();\n" +
"\n" +
"        // Call the start method\n" +
"        toyotaCar.start();\n" +
"\n" +
"        // Call the stop method\n" +
"        toyotaCar.stop();\n" +
"    }\n" +
"}"
                + "\n"
                + "Expected Output: \n");
    }
}
