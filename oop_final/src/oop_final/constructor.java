/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final;

/**
 *
 * @author magda
 */
public class constructor {
    String name;
    int age;
    
    public constructor(String name, int age){
        this.age = age;
        this.name = name;
    }
    
    void displayinfo(){
        System.out.println(" Name: " + name);
        System.out.println("Age: " + age);
    }
    
    void displaycode(){
        System.out.println("This is how constructor is coded: \n"
                + ""
                + "public class constructor {\n" +
"    String name;\n" +
"    int age;\n" +
"    \n" +
"    public constructor(String name, int age){\n" +
"        this.age = age;\n" +
"        this.name = name;\n" +
"    }\n" +
"    \n" +
"    void displayinfo(){\n" +
"        System.out.println(\" Name: \" + name);\n" +
"        System.out.println(\"Age: \" + age);\n" +
"    }"
                + ""
                + "    public static void main(String[] args) {\n" +
"        constructor Constr = new constructor(\"Juan Dela Cruz\", 18); \n" +
"\n" +
"        Constr.displayinfo();"
                + ""
                + 
"    }"
                + "\n"
                + "Expected Output:  \n");
    }
}
