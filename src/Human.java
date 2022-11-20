public class Human {
    private int yearOfBirth;
    private String name;
    private String town;

    public Human(int birthYear, String name, String town){
        yearOfBirth = birthYear;
        this.name = name;
        this.town = town;
    }

    @Override
    public String toString(){
        return "Привет! Меня зовут " + this.name +
                ". Я из города " + this.town + ". Я родился в " + this.yearOfBirth
                + " году. Будем знакомы!";
    }

}
