/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.Scanner;

/**
 *
 * @author aldic2547
 */
public class Math_Method_Program {

    private static double doub1 = 0;
    
    public static void main(String[] args) {
        System.out.println("Type /help to see what commands are available");
        Scanner scan = new Scanner(System.in);
        String input;
        do{
            input = scan.nextLine();
            if(input.equalsIgnoreCase("/help")){
                System.out.println("Command\t\tResult\n-------------------------------------------------------------------------\n"
                        + "/help:\tDisplays all commands\n/rand number:\tGenerates a random number from the number given\n"
                        + "/rnd number:\tDisplays your number rounded\n"
                        + "/power number:\tDisplays what 5 to the power of your number is\n"
                        + "/square number:\tDisplays what your number is square rooted\n"
                        + "/cubeRoot number:\tDisplays what your number is cube rooted\n"
                        + "/exit:\tShuts down the program");
            }
            else if(input.startsWith("/rand")){
                int n = input.indexOf("/rand");
                input = input.substring(n+5);
                input = input.trim();
                int s;
                s = Integer.parseInt(input);
                s = (int)Math.ceil(Math.random()*s);
                System.out.println("Your random number is " + s);
            }
            else if(input.startsWith("/rnd")){
                int n = input.indexOf("/rnd");
                input = input.substring(n+4);
                input = input.trim();
                double s;
                s = Double.parseDouble(input);
                double dub = Math.round(s);
                System.out.println("Here is your number rounded: " + dub);
            }
            else if(input.startsWith("/power")){
                int n = input.indexOf("/power");
                input = input.substring(n+6);
                input = input.trim();
                double s;
                s = Double.parseDouble(input);
                s = Math.pow(5, s);
                System.out.println("Here is 5 to the power of your number: " + s);
            }
            else if(input.startsWith("/square")){
                int n = input.indexOf("/square");
                input = input.substring(n+7);
                input = input.trim();
                double s;
                s = Double.parseDouble(input);
                square(s);
                System.out.println("Here is your number square rooted: " + doub1);
            }
            else if(input.startsWith("/cubeRoot")){
                int n = input.indexOf("/cubeRoot");
                input = input.substring(n+9);
                input = input.trim();
                double s;
                s = Double.parseDouble(input);
                s = cube(s);
                System.out.println("Here is your number cube rooted: " + s);
            }
            else if(input.equalsIgnoreCase("/exit")){
                System.exit(0);
            }
            else{
                System.out.println("That is not a command!");
            }
        }while(true);
    }
    public static void square(double dub){
        doub1 = Math.sqrt(dub);
    }
    public static Double cube(double doub){
        doub = Math.cbrt(doub);
        return doub;
    }
}
