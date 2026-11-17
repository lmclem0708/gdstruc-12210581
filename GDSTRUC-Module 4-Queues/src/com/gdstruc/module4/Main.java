package com.gdstruc.module4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue(5);
        int gameCount = 1;
        int rng;

        while (gameCount < 11)
        {
            System.out.println("\nPress Enter to continue");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            rng = (int) Math.floor(Math.random() * 7 + 1);

            for (int i = 0; i < rng; i++)
            {
                queue.add(new Player(i + 1, "Player", 10));
            }
            System.out.println("Players in queue: " + queue.size());
            queue.printQueue();

            if (queue.size() >= 5)
            {
                System.out.println("\nPlayer count reached! Starting Game #" + gameCount +"...\n");

                for (int j = 0; j < 5; j++)
                {
                    System.out.println("Removed " + queue.remove());
                }

                gameCount++;
            }
        }
    }
}
