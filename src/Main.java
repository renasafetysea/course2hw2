public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим","Минск",-20,"бренд-менеджером");
        System.out.println(maksim);
        System.out.println();

        Human anya = new Human(null,"Москва",29,"методистом образовательных программ");
        System.out.println(anya);
        System.out.println();


        Human katya = new Human("Катя",null,28,"продакт-менеджером");
        System.out.println(katya);
        System.out.println();


        Human artem = new Human("Артем","Москва",27,null);
        System.out.println(artem);
        System.out.println();

        Human vladimir = new Human("Владимир","Казань",21, "безработный");
        System.out.println(vladimir);



    }
}