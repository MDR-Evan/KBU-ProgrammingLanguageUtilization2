public abstract class Man implements Method{
    private String name;
    private String bunho;

    public Man(String name, String bunho) {
        this.name = name;
        this.bunho = bunho;
    }

    public String getName() {
        return name;
    }

    public String getBunho() {
        return bunho;
    }

    @Override
    public String toString() {
        return String.format(" %4s\t%3s", bunho, name);
    }
}
