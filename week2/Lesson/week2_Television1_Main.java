public class Television1_Main {
    public static void main(String[] args) {
        Television1_Object object = new Television1_Object("Samsung", 2017, 55, "LED");
        Television1_Object object2 = new Television1_Object("", 0, 0, "");

        object2.setBrand("LG");
        object2.setYear(2024);
        object2.setSize(81);
        object2.setType("OLED");

        System.out.println(object);
        System.out.println(object2);
    }
}
