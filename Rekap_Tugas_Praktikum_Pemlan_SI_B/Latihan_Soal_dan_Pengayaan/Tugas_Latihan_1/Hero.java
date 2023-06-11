package sib.polymorphismgame;

public class Hero extends Character {
    @Override
    public void move() {
        System.out.println("Hero moves!");
    }

    public void move(String direction) {
        System.out.println("Hero moves " + direction + "!");
    }
}
