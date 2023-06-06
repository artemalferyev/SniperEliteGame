public class ArmouredEnemy extends Enemy {
    private int armour = 1;
    public int getArmour() {
        return armour;
    }

    @Override
    public void hit(int bulletDamage){
        System.out.println("Shot at ArmouredEnemy");
        int damage = getArmour()+getHealth()-bulletDamage;
        System.out.println("Bullet Damage: " + damage);
            isDead();
            System.out.println("Shot at ArmouredEnemy");
            return;
        }

    @Override
    public String toString(){
        return "ArmouredEnemy";
    }

}





