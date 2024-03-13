public class Report1_Person {
//    변수 지정 (기본값)
    private String name;
    private int age;
    private String gender;
//
    public Report1_Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
// Getter : 변수 불러오기
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
// Setter : 변수 변경
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
// Override : print문
    @Override
    public String toString() {
        return String.format("이 친구의 이름은 %s이고, 나이는 %d이며, %s자 입니다.", name, age, gender);
    }

//
}
