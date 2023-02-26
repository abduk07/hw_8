package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0) {
            int coefficent = RPG_Game.random.nextInt(3) + 2;
            boss.setHealth(boss.getHealth() - coefficent * this.getDamage());
            System.out.println("Warrior hits critically: " + coefficent * this.getDamage());

        }
    }
}