package Flower;

public class Bouquet {
     private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public float bouquetValue() {
        float sum=0;
        float margin =  1.1f;
        for (Flower flower : flowers) {
            sum += flower.getCost();
        }
        return sum*margin ;
    }

    public int bouquetLifeSpan() {
        int min = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < min) {
                min = flower.getLifeSpan();
            }
        }
        return min;
    }
}




