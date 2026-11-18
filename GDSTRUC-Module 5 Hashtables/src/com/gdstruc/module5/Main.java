package com.gdstruc.module5;

public class Main {

    public static void main (String[] args)
    {
        Player ploo = new Player(134, "Plooful", 135);
        Player eardell = new Player(536, "TSM Wardell", 648);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 684);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(eardell.getUserName(), eardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        hashtable.printHashtable();

        System.out.println("\nRemoving Plooful\n");

        hashtable.remove("Plooful");
        hashtable.printHashtable();
        System.out.println(hashtable.get("Plooful"));
    }


}
