/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_final;

/**
 *
 * @author magda
 */
public class encapsulation {
    private String username;
    private String password;
    
    public encapsulation( String username, String password){
        this.username = username;
        this.password = password;
    }
    // Getter method for username
    public String getUsername() {
        return username;
    }

    // Setter method for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter method for password
    public String getPassword() {
        return password;
    }

    // Setter method for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Display user information
    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
    
    
    void displaycode(){
        System.out.println("This is how encapsulation is coded:"
                + "\n"
                + "\n"
                + "public class encapsulation {\n" +
"    private String username;\n" +
"    private String password;\n" +
"    \n" +
"    public encapsulation( String username, String password){\n" +
"        this.username = username;\n" +
"        this.password = password;\n" +
"    }\n" +
"    // Getter method for username\n" +
"    public String getUsername() {\n" +
"        return username;\n" +
"    }\n" +
"\n" +
"    // Setter method for username\n" +
"    public void setUsername(String username) {\n" +
"        this.username = username;\n" +
"    }\n" +
"\n" +
"    // Getter method for password\n" +
"    public String getPassword() {\n" +
"        return password;\n" +
"    }\n" +
"\n" +
"    // Setter method for password\n" +
"    public void setPassword(String password) {\n" +
"        this.password = password;\n" +
"    }\n" +
"\n" +
"    // Display user information\n" +
"    public void displayUserInfo() {\n" +
"        System.out.println(\"Username: \" + username);\n" +
"        System.out.println(\"Password: \" + password);\n" +
"    }\n" +
"    \n"
                + "Expected Output: \n \n"
                + "");
    }
}
