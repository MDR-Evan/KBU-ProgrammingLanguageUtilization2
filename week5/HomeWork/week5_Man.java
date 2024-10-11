
public class Man {
    protected String[] person;

    public Man(String[] person) {
        this.person = person;
    }

    public String[] getPerson() {
        return person;
    }

    public void setPerson(String[] person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return String.format("  %4s %4s", person[0], person[1]);
    }
}
