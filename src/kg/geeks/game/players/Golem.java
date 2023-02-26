package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Golem extends Hero {
    private int golemDefence;

    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.THE_ROCK, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.golemDefence = golemDefence;
        int playersNumber= 0;
        golemDefence = boss.getDamage() / 5;
        for (int i = 0; i < heroes.length ; i++) {
            if (heroes[i].getHealth()>0){
                if (getHealth()>0){
                    continue;
                }else {
                    playersNumber++;
                heroes[i].setHealth(heroes[i].getHealth()-(boss.getDamage())-golemDefence);
                setDamage(getDamage()- boss.getDamage()-(golemDefence * playersNumber));
                }
            }

        }


    }


}
