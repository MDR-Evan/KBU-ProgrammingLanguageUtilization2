public class Person {
    protected String id;
    protected String name;
    protected char gender;

    public Person(String id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(" %6s, %3s, %c자", id, name, gender);
    }
}
