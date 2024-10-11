public class Report1_main {
    public static void main(String[] args) {
        Report1_Person man = new Report1_Person("오정민", 21, "여");
        Report1_Person man2 = new Report1_Person("김선민", 31, "남");

        man.setAge(man.getAge() - 5);

        System.out.println(man.getName() + "/" + man.getAge() + "/" + man.getGender());
        System.out.println(man);
    }
}
