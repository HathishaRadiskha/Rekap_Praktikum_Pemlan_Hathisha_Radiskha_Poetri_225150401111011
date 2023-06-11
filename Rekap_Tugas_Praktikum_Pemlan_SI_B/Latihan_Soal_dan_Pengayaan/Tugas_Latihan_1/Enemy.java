package sib.polymorphismgame;

public class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy moves!");
    }

    public void move(int steps) {
        System.out.println("Enemy moves " + steps + " steps!");
    }
}
