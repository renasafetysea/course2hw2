public class Human {
    String name;
    String town;
    int yearOfBirds;
    String job;

    public Human(String name, String town, int yearOfBirds, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirds = yearOfBirds;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Меня зовут "+ name +
                ". Я из города " + town +
                " .Мне " + yearOfBirds +
                " лет.Я работаю " + job +
                " .Будем знакомы!";

    }
}

