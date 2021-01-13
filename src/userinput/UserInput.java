/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.Scanner;





/**
 *
 * @author NAVTTC07
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner userInput = new Scanner(System.in);
        System.out.println("ENter any number ");
        
        int num; //declaration
        double num1;
        //num=userInput.nextInt();// initialization
        System.out.println("ENter 2nd number ");
       // num1=userInput.nextDouble();
        
        //num1=userInput.nextFloat();
        
        System.out.println("ENter your name ");
        String name;
        name=userInput.nextLine();
        System.out.println("Name "+name);
        
        char ch;
        System.out.println("ENter any character");
        ch=userInput.next().charAt(0);
        System.out.println("char "+ ch);
        
        
//        System.out.println("num "+num);
//        System.out.println("num1 "+num1);
        
        //Name is Ali
        //Age is 20
        //Height 5.5
        //Grade A
        
      
        

    }
    
}
