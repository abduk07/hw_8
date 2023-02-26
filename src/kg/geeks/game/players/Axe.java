package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Axe extends Hero {
    public Axe(int health, int damage, String name) {
        super(health, damage, SuperAbility.BATTLE_HUNGER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int chanceBrokeDefence = RPG_Game.random.nextInt(10);
        if (getHealth() > 0 && chanceBrokeDefence == 7) {
        boss.setDefence(boss.getDefence());
        System.out.println(chanceBrokeDefence);}


    }
}
