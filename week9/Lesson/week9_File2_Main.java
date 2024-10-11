import java.io.File;

public class week9_File2_Main {
    public static void main(String[] args) {
        String dir = "C:";
        File file = new File(dir);

        System.out.println("Directory Name : " + dir);
        System.out.println("Last Modified : " + file.lastModified());
        System.out.println("Can Read ? " + file.canRead());
        System.out.println("Can Write ? " + file.canWrite());
        System.out.println("is File ? " + file.isFile());
        System.out.println("is Directory ? " + file.isDirectory());

        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            File newFile = new File(dir, list[i]);
            if (newFile.isDirectory()) {
                System.out.println(list[i] + "는 디렉토리");
            } else {
                System.out.println(list[i] + "는 파일");
                System.out.printf(", Size = %,d Bytes\n", newFile.length());
            }
        }
    }
}
