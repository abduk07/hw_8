package kg.geeks.game.players;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, SuperAbility.BLOCK_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        this.blockedDamage = blockedDamage;
        blockedDamage = boss.getDamage() / 2;
        this.setHealth(getHealth() - blockedDamage);
        this.setDamage(getDamage() + blockedDamage);
    }
}
