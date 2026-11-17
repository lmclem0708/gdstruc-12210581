package com.gdstruc.midterm;

import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args)
    {
        int turnNumber = 0;
        int rng = (int) Math.floor(Math.random() * 3 + 1);
        int rng2 = (int) Math.floor(Math.random() * 5 + 1);
        int cardRng = (int) Math.floor(Math.random() * 10 + 1);
        int cardRng2 = (int) Math.floor(Math.random() * 4);
        CardStack stack = new CardStack();
        CardStack discardedStack = new CardStack();

        String[] cardTypes = new String[4];
        cardTypes[0] = "Spades";
        cardTypes[1] = "Clubs";
        cardTypes[2] = "Hearts";
        cardTypes[3] = "Diamonds";


        for (int i = 0; i < 30; i++)
        {
            cardRng = (int) Math.floor(Math.random() * 10 + 1);
            cardRng2 = (int) Math.floor(Math.random() * 4);

            stack.push(new Card(cardRng, cardTypes[cardRng2]));
        }

        while (!stack.isEmpty())
        {
            rng = (int) Math.floor(Math.random() * 3 + 1);
            System.out.println("Type Y to begin next turn");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("Y") || input.equals("y"))
            {
                turnNumber++;
                System.out.println(" ");
                System.out.println("============== TURN " + turnNumber + " ==============");
                System.out.println("Current deck of cards: ");
                stack.printStack();
                stack.printSize();
                System.out.println("Discarded cards: ");
                discardedStack.printStack();
                discardedStack.printSize();

                if (rng == 1) // draw cards
                {
                    rng2 = (int) Math.floor(Math.random() * 5 + 1);
                    System.out.println("==============================================");
                    System.out.println("Drawing " + rng2 + "...");
                    for (int i = 0; i < rng2; i++)
                    {
                        cardRng = (int) Math.floor(Math.random() * 10 + 1);
                        cardRng2 = (int) Math.floor(Math.random() * 4);

                        stack.push(new Card(cardRng, cardTypes[cardRng2]));
                    }

                    System.out.println("Current deck of cards: ");
                    stack.printStack();
                    stack.printSize();

                    System.out.println("Discarded cards: ");
                    discardedStack.printStack();
                    discardedStack.printSize();
                }
                else if (rng == 2 || rng == 3 && discardedStack.isEmpty()) // discarding cards
                {
                    rng2 = (int) Math.floor(Math.random() * 5 + 1);
                    System.out.println("==============================================");
                    System.out.println("Discarding " + rng2 + "...");

                    for (int i = 0; i < rng2; i++)
                    {
                        discardedStack.push(stack.pop());
                    }

                    System.out.println("Current deck of cards: ");
                    stack.printStack();
                    stack.printSize();

                    System.out.println("Discarded cards: ");
                    discardedStack.printStack();
                    discardedStack.printSize();
                }
                else if (rng == 3 && !discardedStack.isEmpty()) // drawing discarded cards
                {
                    rng2 = (int) Math.floor(Math.random() * discardedStack.getSize() + 1);
                    if (rng2 > 5)
                    {
                        rng2 = rng2 / 2; // ensures player doesn't draw more than 5 
                    }
                    System.out.println("==============================================");
                    System.out.println("Drawing " + rng2 + " from the discarded pile...");

                    for (int i = 0; i < rng2; i++)
                    {
                        stack.push(discardedStack.pop());
                    }

                    System.out.println("Current deck of cards: ");
                    stack.printStack();
                    stack.printSize();

                    System.out.println("Discarded cards: ");
                    discardedStack.printStack();
                    discardedStack.printSize();
                }
            }

        }



    }



}
