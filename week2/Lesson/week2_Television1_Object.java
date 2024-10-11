/***********************************************************************************************************************
* 다름과 같이 출력하는 프로그램을 만들어보자.
* [우리집 TV는 Samsung에서 만든 2017년형 55인치 LED TV 입니다.]
*
* Class 설계
*   Brand : String
*   Year : int
*   Size : int
*   type : String
***********************************************************************************************************************/
public class Television1_Object {
/* 변수 */
    private String brand;
    private int year;
    private int size;
    private String type;
/* 생성자 */
    public Television1_Object(String brand, int year, int size, String type) {
        this.brand = brand;
        this.year = year;
        this.size = size;
        this.type = type;
    }
/**
* Default 생성자
* 오버로드 : 중복정의
*     public Television_object() {
*     }
*
*    public Television_object(String brand, int year, int size) { //type의 경우 LED 고정
*         this.brand = brand;
*         this.year = year;
*         this.size = size;
*         type = "LED";
*     }
*/
/* getter & setter */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
/* 출력 */
    @Override //오버라이딩 : 재정의
    public String toString() {
        return String.format("우리집 TV는 %s에서 만든 %d년형 %d인치 %s TV입니다.",brand, year, size, type);
    }
}