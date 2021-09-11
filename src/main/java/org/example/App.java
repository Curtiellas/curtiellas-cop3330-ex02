package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the input string? ");

        //records the next input from user
        String word = sc.nextLine();

        //records the number of characters in a string
        int length = word.length();

        //print all the values in one output
        System.out.println( word + " has " + length + " characters." );
    }
}
