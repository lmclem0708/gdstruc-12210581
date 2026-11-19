package com.gdstruc.module6;

public class Main {

    public static void main (String[] args)
    {
        int numbers[] = {60, 33, 12, 64, 17, 105, -53};
        System.out.println(edgeSearch(numbers, 12));
        System.out.println(edgeSearch(numbers, 1));
    }

    public static int edgeSearch(int[] input, int value)
    {
        int start = 0;
        int end = input.length - 1;
        int middle = (start + end) / 2;
        int index = start;
        int startIncrement = 0;
        int endIncrement = 0;

        while (start <= end)
        {
            if (input[index] == value)
            {
                return index;
            }
            else if (input[index] != value)
            {
                if (index < middle)
                {
                    index = end - endIncrement;
                    endIncrement++;
                }
                else
                {
                    startIncrement++;
                    index = start + startIncrement;
                }

                if (index > input.length - 1 || index < 0) // if increment starts to go beyond array length, means it wasn't able to find value
                {
                    return -1;
                }
            }
        }
        return -1;
    }
}
