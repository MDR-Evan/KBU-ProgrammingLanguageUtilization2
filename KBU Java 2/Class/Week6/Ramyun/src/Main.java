public class Main {
    public static void main(String[] args) {
        Rice_Ramyun riceRamyun = new Rice_Ramyun("신라면", true);
        riceRamyun.cooking();

        GeneralRamyun generalRamyun = new GeneralRamyun("삼양라면", false);
        generalRamyun.cooking();

        Atype_Ramyun atypeRamyun = new Atype_Ramyun("안성탕면", true);
        atypeRamyun.cooking();
    }
}