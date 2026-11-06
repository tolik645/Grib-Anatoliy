public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");
        System.out.println("Ім'я: "+person1.name+", Вік: "+person1.age+", Професія: "+person1.profession);
        System.out.println("Ім'я: "+person2.name+", Вік: "+person2.age+", Професія: "+person2.profession);
        System.out.println("Ім'я: "+person3.name+", Вік: "+person3.age+", Професія: "+person3.profession);
        Person person4 = new Person("Alice", 28, "Архітектор");
        System.out.println("(Після оновлення професії)");
        person4.profession = person1.setNewProfession("Дизайнер");
        System.out.println("Ім'я: "+person4.name+", Вік: "+person4.age+", Професія: "+person4.profession);
    }
}
