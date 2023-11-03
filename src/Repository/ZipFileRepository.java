package Repository;

import DataAccess.ZipDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZipFileRepository implements IZipFileRepository {

    @Override
    public void zipFile() {
        try {
            ZipDAO.Instance().zipFile();
        } catch (IOException ex) {
            Logger.getLogger(ZipFileRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean compressTo(String pathSrc, String fileZipName, String pathCompress) {
        try {
            ZipDAO.Instance().compressTo(pathSrc, fileZipName, pathCompress);
        } catch (IOException ex) {
            Logger.getLogger(ZipFileRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public void unzipFile() {
        try {
            ZipDAO.Instance().unzipFile();
        } catch (IOException ex) {
            Logger.getLogger(ZipFileRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean extractTo(String pathZipFile, String pathExtract) {
        try {
            ZipDAO.Instance().extractTo(pathZipFile, pathExtract);
        } catch (IOException ex) {
            Logger.getLogger(ZipFileRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
