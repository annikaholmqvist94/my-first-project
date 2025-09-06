package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //vi behöver deklarera och initiera 2 variabler, pinkod och namn
        int pinKod=9990;
        String namn= "Annika";

        //vi välkomnar användaren
        System.out.println( "Välkomen till bibilioteket, vänligen fyll i ditt namn");
        Scanner scanner = new Scanner(System.in);
        namn=scanner.nextLine();

        // se till att kolla att användaren skriver in text och inte tal
        //se till att användaren skriver rätt namn
        //se till att ignorera uppercase

        // istället för påståendet skulle vi kunna sätta while(!!namn.equalsIgnoreCase("Annika"))
        while(!namn.equals("Annika") && !namn.equals("annika")){
            if(scanner.hasNextLine()){
                System.out.println("Felaktig input, försök igen");
                scanner.nextLine();

            }

        }

        System.out.println("skriv in din pinkod");
        int input=scanner.nextInt();

        while(input!=pinKod) {
            System.out.println("skriv in din pinkod");

            if(scanner.hasNextInt()){
                input=scanner.nextInt();
                if (input!=pinKod){
                    System.out.println("fel kod");}
            } else{
                System.out.println("fel kod endast siffror");
                scanner.next();
            }

        }
        System.out.println("ätt pinkod, välkommen");

    }
}