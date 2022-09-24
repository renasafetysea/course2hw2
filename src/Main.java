public class Main {
    public static void main(String[] args) {
        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.yearOfBirds = 35;

        maksim.say();
        System.out.println();

        Human anya = new Human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirds = 29;

        anya.say();
        System.out.println();


        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirds = 28;

        katya.say();
        System.out.println();


        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirds = 27;

        artem.say();
        System.out.println();


    }
}