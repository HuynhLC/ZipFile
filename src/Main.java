
import controller.ZipFileProgram;

public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Compression","Extraction"};
        ZipFileProgram z = new ZipFileProgram("========= Zipper program =========", mChon, "Exit");
        z.run();
    }
}
