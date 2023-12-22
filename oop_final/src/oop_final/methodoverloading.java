/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final;

/**
 *
 * @author magda
 */
public class methodoverloading {
    void printmessage(String message){
        System.out.println(message);
    }
    
    void printmessage(String message, int number){
        System.out.println(message + " " + number);
    }
    
    void displaycode(){
        System.out.println("This is how method overloading is coded: \n"
                + "\n"
                + "public class methodoverloading {\n" +
"    void printmessage(String message){\n" +
"        System.out.println(message);\n" +
"    }\n" +
"    \n" +
"    void printmessage(String message, int number){\n" +
"        System.out.println(message + \" \" + number);\n" +
"    }\n" +
"    "
                + ""
                + ""
                + "public static void main(String[] args) {\n" +
"        MethodOverloading obj = new MethodOverloading();\n" +
"\n" +
"        // Calling the first printMessage method\n" +
"        overload.printmessage(\"This is a message from method overloading\");\n" +
"        overload.printmessage(\"This is a message is overlaoded method to print the numebr: \", 5);\n" +
"\n" +"    }"
                + ""
                + "\n"
                + "Expected Output: \n");
    }
}
