package com.company;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter number of players:");
        Scanner in = new Scanner(System.in);
        int playersAmount = in.nextInt();

        LinkedList<Player> players = createPlayers(playersAmount);

        System.out.println("Game started");
        while (players.size() > 2){
            players = playRound(players, false);

            System.out.println("Round finished. Winners are:");
            for (Player p : players){
                System.out.println("PlayerId = " + p.getId() + ", score = " + p.getScore());
            }
            System.out.println();
        }
    }

    private static LinkedList<Player> createPlayers(int playersAmount) {
        LinkedList<Player> players = new LinkedList<Player>();
        for (int i = 0; i < playersAmount; i++){
            players.add(new Player(i));
        }
        return players;
    }

    private static LinkedList<Player> playRound(LinkedList<Player> players, boolean isBonusRound) {

        LinkedList<Player> headPlayers = new LinkedList<Player>();
        LinkedList<Player> tailPlayers = new LinkedList<Player>();
        Random random = new Random();

        for (int i = 0; i < players.size(); i ++){
            if (random.nextBoolean()){
                headPlayers.add(players.get(i));
            }
            else {
                tailPlayers.add(players.get(i));
            }
        }

        if (tailPlayers.size() == players.size()){
            for (Player p : tailPlayers){
                p.decreaseScoreBy(1);
            }
            return tailPlayers;
        } else if (headPlayers.size() == players.size()){
            if (isBonusRound){
                for (Player p : headPlayers){
                    p.increaseScoreBy(2);
                }
                return headPlayers;
            }else {
                System.out.println("BONUS ROUND");
                return playRound(players, true);
            }
        } else {
            LinkedList<Player> winners = new LinkedList<Player>();
            if (tailPlayers.size() > 1){
                winners.addAll(tailPlayers);
            }
            if (headPlayers.size() > 1){
                winners.addAll(headPlayers);
            }

            for (Player p : winners){
                p.increaseScoreBy(1);
            }
            return winners;
        }
    }
}
