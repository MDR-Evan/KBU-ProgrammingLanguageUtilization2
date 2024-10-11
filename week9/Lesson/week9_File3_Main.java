import java.io.File;

public class week9_File3_Main {
    public static void main(String[] args) {
        String dir = "C:\\sample\\test";
        File file = new File(dir);
        String des = "C:\\sample\\test홍길동";

        if (file.exists()) {
            System.out.println(dir + "이미 존재합니다.");
            if (file.renameTo(new File(des))) {
                System.out.println(des + "변경 완료");
            } else {
                System.out.println(des + "변경 실패");
            }
//            if (file.delete()) {
//                System.out.println(dir + "삭제 완료");
//            } else {
//                System.out.println(dir + "삭제 실패");
//            }
        } else {
            if (file.mkdir()) {
                System.out.println(dir + "생성 완료");
            } else {
                System.out.println(dir + "생성 실패");
            }
        }
    }
}