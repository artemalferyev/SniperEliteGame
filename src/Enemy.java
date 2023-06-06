abstract public class Enemy extends GameObject {
    private int health = 1;

    public void isDead() {
        if (getHealth() == 0) {
            System.out.println("Dead");
        }
        System.out.println("Not Dead");
    }

    public String getMessage(String message) {
        return message;
    }
    public int getHealth() {
        return health;
    }

    public void hit(int bulletDamage){
    }
}
