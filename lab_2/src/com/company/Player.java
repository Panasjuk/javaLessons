package com.company;

public class Player {
    private int id;
    private int score;

    public Player(int playerId){
        id = playerId;
    }

    public int getId(){
        return id;
    }

    public int getScore(){
        return score;
    }

    public void increaseScoreBy(int value){
        score += value;
    }

    public void decreaseScoreBy(int value){
        score -= value;
    }
}
