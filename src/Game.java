import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int numOfObjects;

    public Game(int numOfObjects) {

        this.numOfObjects = numOfObjects;

    }

    public GameObject[] getGameObjects() {
        return gameObjects;
    }

    public int getNumOfObjects(){
        return numOfObjects;
    }

    public void start() {
        //Creates sniperRifle, iterates over array of objects and on every object shoot method used
        //SniperRifle
        SniperRifle sniperRifle = new SniperRifle(1);
        //creation of objects
        createObjects(numOfObjects);
        // call shoot on every Enemy type in an array
        for (int j = 0; j < gameObjects.length; j++) {
            if (gameObjects[j] instanceof Enemy) {
                Enemy en = (Enemy) gameObjects[j];
                sniperRifle.shoot(en);
                System.out.println();
            } else {
                System.out.println();
                sniperRifle.getShotsFired();
                System.out.println("You have shot a tree");
            }
        }
    }
    public void createObjects(int numOfObjects) {
        //creating Enemy and Tree objects and putting them in array
        gameObjects = new GameObject[numOfObjects];
        for (int i = 0; i <= gameObjects.length - 1; i++) {
            double random = Math.random();
            if (random < 0.4) {
                gameObjects[i] = new SoldierEnemy();
            } else if (random < 0.8) {
                gameObjects[i] = new ArmouredEnemy();
            } else {
                gameObjects[i] = new Tree();
               }
            }
        }
    }






