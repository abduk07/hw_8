package kg.geeks.game.logic;

import kg.geeks.game.players.*;

import java.util.Random;

public class RPG_Game {
    public static Random random = new Random();
    private static int roundNumber;


    public static void startGame() {
        Boss boss = new Boss(2000, 50, "Roshan");
        Warrior warrior = new Warrior(150, 10, "Phantom Assasin");
        Medic doc = new Medic(120, 5, 10, "Witch Doctor");
        Magic magic = new Magic(140, 5, "Ogre magi");
        Berserk berserk = new Berserk(150, 10, "Troll Warlord");
        Medic assistent = new Medic(140, 5, 5, "Shadow Shaman");
        Thor thor = new Thor(150,10,"Thor");
        Golem golem = new Golem(300,2,"Tiny");
        Witcher witcher = new Witcher(150,0,"Witcher");
        Axe axe = new Axe(170,10,"Axe");
        Hero[] heroes = {warrior, magic, berserk,thor,golem,witcher,axe,doc,assistent};

        printStatistics(boss, heroes);
        while (!isGameFinished(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence(heroes);
        boss.atack(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility() != boss.getDefence() && heroes[i].getHealth()>0) {
                heroes[i].atack(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }


    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("ROUND: " + roundNumber + "------------------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i] );

        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("HEROES WON");
            return true;
        }
        boolean isAllHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                isAllHeroesDead = false;
                break;
            }

        }
        if (isAllHeroesDead) {
            System.out.println("BOSS WON");
        }
        return isAllHeroesDead;
    }
}





