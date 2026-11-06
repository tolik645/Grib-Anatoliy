public class Person {
    String name;
    int age;
    String profession;
    public Person(String name, int age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    public String persInfo() {
        return "Ім'я: "+name+", Вік: "+age+", Професія: "+profession;
    }
    public String setNewProfession(String job){
        profession = job;
        return profession;
    }
}
