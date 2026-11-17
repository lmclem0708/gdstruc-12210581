package com.gdstruc.module3;

public class Main {

    public static void main(String[] args)
    {
        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "Mina", 100));
        stack.push(new Player(2, "Pocket", 50));
        stack.push(new Player(3, "Rem", 20));
        stack.push(new Player(4, "Graves", 30));


        stack.printStack();
        stack.pop();
        stack.printStack();
    }


}
