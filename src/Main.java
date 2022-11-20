public class Main {
    public static void main(String[] args) {
        Human Maksim = new Human(1988, "Максим", "Минск","бренд-менеджер");
        Human Anya = new Human(1993, "Аня", "Москва","методист образовательных программ");
        Human Katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human Artem = new Human(1995, "Артем", "Москва","директор по развитию бизнеса");

        System.out.println(Maksim.toString());
        System.out.println(Anya.toString());
        System.out.println(Katya.toString());
        System.out.println(Artem.toString());
    }
}