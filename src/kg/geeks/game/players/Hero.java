package kg.geeks.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {
    private SuperAbility ability;

    public Hero(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
    }

    public Hero(int health, int damage, String name, SuperAbility ability) {
        super(health, damage, name);
        this.ability = ability;
    }



    public SuperAbility getAbility() {
        return ability;
    }

    public void atack(Boss boss) {
        if (boss.getHealth() > 0)
            boss.setHealth(boss.getHealth() - this.getDamage());
    }

}
