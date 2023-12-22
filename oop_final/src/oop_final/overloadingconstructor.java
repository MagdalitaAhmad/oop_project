package oop_final;

public class overloadingconstructor {
    String text;
    int number;

    // Default constructor
    public overloadingconstructor(String text) {
        // Call the superclass constructor to set default values
        this.text = text;
    }

    // Parameterized constructor with name and age
    public overloadingconstructor(String message, int number) {
        // Call the superclass constructor to set provided values
        
        this.text = message;
        this.number = number;
    }

    void displayInfo() {
        System.out.println(text + " " + number);
    }
    
    void displayText(){
        System.out.println(text);
    }
    
    void displaycode(){
        System.out.println("This is how constructor overloading is coded: \n"
                + ""
                + "public class overloadingconstructor extends constructor {\n" +
"    String message;\n" +
"    int number;\n" +
"\n" +
"    // Default constructor\n" +
"    public overloadingconstructor(String message) {\n" +
"        // Call the superclass constructor to set default values\n" +
"        super(\"Unknown\", 0);\n" +
"        this.message = message;\n" +
"    }\n" +
"\n" +
"    // Parameterized constructor with name and age\n" +
"    public overloadingconstructor(String message, int number) {\n" +
"        // Call the superclass constructor to set provided values\n" +
"        super(\"Unknown\", 0);  // You can set default values or provide actual values\n" +
"        this.message = message;\n" +
"        this.number = number;\n" +
"    }\n" +
"\n" +
"    void displayInfo() {\n" +
"        System.out.println(message + \" \" + number);\n" +
"    }"
                + "\n"
                + "\n"
                + "Expected Output");
    }
}
