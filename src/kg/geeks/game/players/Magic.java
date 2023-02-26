package kg.geeks.game.players;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && getHealth()>0) {
                int boost = 2;
                heroes[i].setDamage(heroes[i].getDamage() + boost);
            } else {
                heroes[i].getDamage();
            }if (heroes[i].getDamage()==0){
                heroes[i].setDamage(0);


            }


        }
    }


}



