package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 4 Solution
 *  Copyright 2021 Drake Scott
 */

public class exercise4 {
    public static void main(String[] args){

        Scanner str = new Scanner (System.in);
        System.out.print("Enter a noun: ");
        String noun = str.nextLine();

        System.out.print("Enter a verb: ");
        String verb = str.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = str.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = str.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");


    }
}
