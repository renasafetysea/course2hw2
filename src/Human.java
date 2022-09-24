import java.util.Objects;

public class Human {
    private String name;
    private String town;
    private int yearOfBirds;
    private String job;


    public Human(String name, String town, int yearOfBirds, String job) {
        this.name = Objects.requireNonNullElse(name,"Информация не указана!");
        this.town = Objects.requireNonNullElse(town,"Информация не указана!");
        if (yearOfBirds >= 0) {
            this.yearOfBirds = yearOfBirds;
        }else {
            this.yearOfBirds = Math.abs(yearOfBirds);
        }
        this.job = Objects.requireNonNullElse(job,"Информация не указана!");
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

