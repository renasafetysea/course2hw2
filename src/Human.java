import java.util.Objects;

public class Human {
     String name;
    private String town;
    private int yearOfBirds;
    String job;


    public Human(String name, String town, int yearOfBirds, String job) {
        this.name = Objects.requireNonNullElse(name,"Информация не указана!");
        this.town = Objects.requireNonNullElse(town,"Информация не указана!");
        if (yearOfBirds <= 0 ) {
            this.yearOfBirds = 0;
        }else {
            this.yearOfBirds = yearOfBirds;

        }
        this.job = Objects.requireNonNullElse(job,"Информация не указана!");
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if(town == null || town.isEmpty() || town.isBlank()){
        this.town = town;
    }else {
            this.town = "Информация не указана";
        }
    }

    public void setYearOfBirds (int yearOfBirds) {
        if(yearOfBirds <= 0){
            this.yearOfBirds = yearOfBirds;
        }else {
            this.yearOfBirds = 0;

    }
    }
    public int getYearOfBirds() {
        return yearOfBirds;
    }

    @Override
    public String toString() {
        return "Меня зовут "+ name +
                ". Я из города " + getTown() +
                " .Мне " + getYearOfBirds() +
                " лет.Я работаю " + job +
                " .Будем знакомы!";

    }
}

