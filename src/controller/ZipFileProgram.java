package controller;

import Repository.ZipFileRepository;
import view.Menu;

public class ZipFileProgram extends Menu {
    private final ZipFileRepository zip;
    
    public ZipFileProgram(String td, String[] mc, String exit) {
        super(td, mc, exit);
        
        zip = new ZipFileRepository();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                zip.zipFile();
                break;
            case 2:
                zip.unzipFile();
                break;
            case 3:
                System.exit(0);
        }
    }
}
