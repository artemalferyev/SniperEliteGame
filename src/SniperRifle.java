public class SniperRifle{
    private int bulletDamage = 1;
    private int shotsFired;

    public SniperRifle(int bulletDamage){
        this.bulletDamage = bulletDamage;
    }

    public int getBulletDamage() {
        return bulletDamage;
    }

    public int getShotsFired(){
        return shotsFired;
    }

    public void shoot(Enemy enemy){
        shotsFired++;
        System.out.println();
        System.out.println("Shots fired: " + shotsFired);
        System.out.println();
        enemy.hit(bulletDamage);
    }
}
