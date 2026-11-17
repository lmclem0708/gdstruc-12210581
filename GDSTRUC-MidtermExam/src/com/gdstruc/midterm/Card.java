package com.gdstruc.midterm;
import java.util.Objects;

public class Card {
    private int number;
    private String type;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Card card = (Card) obj;
        return number == card.number &&
                Objects.equals(type, card.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type);
    }

    @Override
    public String toString() {
        if (number == 1)
        {
            return "Ace of " + type;
        }
        else
        {
            return number + " of " +
                    type;
        }

    }

    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
