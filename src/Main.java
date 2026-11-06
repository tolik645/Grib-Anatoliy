public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        System.out.println(person1.persInfo());
        System.out.println(person2.persInfo());
        System.out.println(person3.persInfo());
        Person person4 = new Person("Alice", 28, "Архітектор");
        System.out.println(person4.persInfo());
        System.out.println("(Після оновлення професії)");
        person4.profession = person4.setNewProfession("Дизайнер");
        System.out.println(person4.persInfo());
    }
}
