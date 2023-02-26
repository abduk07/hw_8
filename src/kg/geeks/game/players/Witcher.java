package kg.geeks.game.players;

public class Witcher extends Hero {


    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.SWAP, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0) {
                setHealth(0);
                System.out.println("Witcher swap health");
                heroes[i].setHealth(100);

                break;




            }


        }
    }}
