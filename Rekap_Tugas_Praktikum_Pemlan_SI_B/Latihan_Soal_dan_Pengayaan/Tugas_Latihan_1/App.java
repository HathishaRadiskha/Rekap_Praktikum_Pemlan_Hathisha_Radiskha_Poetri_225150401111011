package sib.polymorphismgame;

public class App {
    public static void main(String[] args) {
                // Static polymorphism
                System.out.println();
                System.out.println("==========================");
                System.out.println("Static Polymorphism");
                System.out.println("==========================");
                Hero hero = new Hero();
                hero.move(); 
                
                Enemy enemy = new Enemy();
                enemy.move(); 
                
                // Dynamic polymorphism
                System.out.println();
                System.out.println("==========================");
                System.out.println("Dynamic Polymorphism");
                System.out.println("==========================");

                Character character;
                
                character = new Hero();
                character.move(); 
                
                character = new Enemy();
                character.move(); 
                
                character = new Witch();
                character.move();

                character = new Fighter();
                character.move();
                
                // Casting to Character reference
                System.out.println();
                System.out.println("==========================");
                System.out.println("Casting to Character Ref");
                System.out.println("==========================");

                character = (Character) new Witch(); 
                character.move(); 
                
                // Casting back to Witch reference
                System.out.println();
                System.out.println("==========================");
                System.out.println("Casting to Witch Ref");
                System.out.println("==========================");
                Witch witch = (Witch) character; 
                witch.move();
    }
}
