package com.gdstruc.module2;

public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;
    private PlayerNode prevPlayer;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public PlayerNode getPrevPlayer() {
        return prevPlayer;
    }

    public void setPrevPlayer(PlayerNode prevPlayer) {
        this.prevPlayer = prevPlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + this.player.id +
                ", name='" + this.player.name + '\'' +
                ", level=" + this.player.level +
                '}';
    }
}
