package taskfivefive;

import taskfivefive.Fruit;

public class Grape extends Fruit {
    int numberOfGrapes;

    public Grape(int numberOfGrapes) {
        this.numberOfGrapes = numberOfGrapes;
    }

    void eatGrapes(int numberOfGrapesEaten) {
        numberOfGrapes -= numberOfGrapesEaten;
    }
}
