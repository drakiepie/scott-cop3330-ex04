package org.example;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args){

        Scanner str1 = new Scanner (System.in);
        System.out.print("Enter a noun: ");
        String noun = str1.nextLine();

        Scanner str2 = new Scanner (System.in);
        System.out.print("Enter a verb: ");
        String verb = str2.nextLine();

        Scanner str3 = new Scanner (System.in);
        System.out.print("Enter an adjective: ");
        String adj = str3.nextLine();

        Scanner str4 = new Scanner (System.in);
        System.out.print("Enter an adverb: ");
        String adv = str4.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");


    }
}
