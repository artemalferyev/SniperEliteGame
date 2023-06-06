public class SoldierEnemy extends Enemy {

    @Override
    public void hit(int bulletDamage){
        System.out.println("Shot at Soldier");
        int damage = getHealth()-bulletDamage;
        System.out.println("Bullet Damage: " + bulletDamage);
        if(getHealth()==0){
            isDead();
            System.out.println("Shot at Soldier");
            return;
        }
    }
    @Override
    public String toString(){
        return "Soldier";
    }
}
