package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private PlayerNode end;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        if (head != null)
        {
            playerNode.setPrevPlayer(head);
            end = head;
        }
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void removeFirstElement()
    {
        PlayerNode next = head.getNextPlayer();
        head = next;
    }

    public void getSizeList()
    {
        PlayerNode current = head;
        int count = 0;

        while (current != null)
        {
            count++;
            current = current.getNextPlayer();
        }
        System.out.println(" ");
        System.out.println("Size: " + count);
    }

    public void contains(int id, String name, int level)
    {
        PlayerNode current = head;

        while (current != null)
        {
            if (current.getPlayer().id == id && current.getPlayer().name == name && current.getPlayer().level == level)
            {
                System.out.println("Match found!");
                break;
            }
            current = current.getNextPlayer();
        }
    }

    public void indexOf(int id, String name, int level)
    {
        PlayerNode current = head;
        int index = 0;
        while (current != null)
        {

            if (current.getPlayer().id == id && current.getPlayer().name == name && current.getPlayer().level == level)
            {
                System.out.println("Index: " + index);
                break;
            }
            index++;
            current = current.getNextPlayer();
        }
    }
    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.print("null");
        PlayerNode tail = end;

        System.out.println(" ");
        while (tail != null)
        {
            System.out.print(tail);
            System.out.print(" <- ");
            tail = tail.getPrevPlayer();
        }
        System.out.print("TAIL");
    }
}
