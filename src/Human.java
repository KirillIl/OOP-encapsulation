import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    private  int age;
    public String name;
    private String town;
    public String jobTitle;

    Human (int yearOfBirth, int age, String name, String town, String jobTitle) {
        if (age != 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        }else{
            this.yearOfBirth = yearOfBirth;
        }
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        if (name == null || name == "") {
            this.name = "Информация не указана";
        }
        if (town == null ||town == "") {
            this.town = "Информация не указана";
        }
        if (jobTitle == null || jobTitle == "") {
            this.jobTitle = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }else{
            this.yearOfBirth = 0;
        }
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        if (town != null || !town.isEmpty() || !town.isBlank()) {
            this.town = town;
        }else{
            this.town = "Информация не указана";
        }
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}