public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    public Human(int birthYear, String name, String town){
        if(yearOfBirth < 0){
            yearOfBirth = 0;
        }
        yearOfBirth = birthYear;

        if(name == null || name.equals(" ")){
            name = "Информация не указана";
        }
        this.name = name;

        if(town == null || town.equals(" ")){
            town = "Информация не указана";
        }
        this.town = town;
    }

    @Override
    public String toString(){
        return "Привет! Меня зовут " + this.name +
                ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth
                + " году. Будем знакомы!";
    }

}
