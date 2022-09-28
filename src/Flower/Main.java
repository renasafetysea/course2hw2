package Flower;

public class Main {

    public static void main(String[] args) {
        Flower rose = new Flower("Roza","Holland", 35.59f,0);
        System.out.println(rose);
        System.out.println();
        Flower hrizantema = new Flower("Hrizantema",null,15.00f,5);
        System.out.println(hrizantema);
        System.out.println();
        Flower pion = new Flower("Pion","England",69.90f,1);
        System.out.println(pion);
        System.out.println();
        Flower gipsofila = new Flower("Gipsofila", "Turkey", 19.50f, 10);
        System.out.println(gipsofila);

        Bouquet bouquet = new Bouquet(new Flower[]{rose, rose, rose,hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,gipsofila});
        System.out.println("букет простоит " + bouquet.bouquetLifeSpan()+ " дня");
        System.out.println("стоимость букета " + bouquet.bouquetValue());

    }
}