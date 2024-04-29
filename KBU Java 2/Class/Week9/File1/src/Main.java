import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileSystemView fileSystemView = FileSystemView.getFileSystemView();
        File[] files = File.listRoots();

        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                System.out.println("Drive Letter : " + files[i]);
                System.out.println("\tType : " + fileSystemView.getSystemTypeDescription(files[i]));
                System.out.println("Total Space : " + files[i].getTotalSpace());
                System.out.printf("\tFree Space : %,d Bytes\n", files[i].getTotalSpace());
                System.out.println();
            }
        }
    }
}