package org.example;


import java.util.Scanner;

/**
 * StonkProject - A simple app to keep track of your stock portfolio
 * 2/10/2021 Wednesday
 * To the moon!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Welcome to the stonk Portfolio Tracker!" );
        System.out.println("What would you like to do? ");
        System.out.println("1. check price of a stock ");

        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();

        if( choice.equals("1")){
            System.out.println("Enter Ticker: ");
            String ticker = keyboard.nextLine();
            System.out.println(StonkUtility.getCurrentPriceOfStonk(ticker));
        }
    }
}
