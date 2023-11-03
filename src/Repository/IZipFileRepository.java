package Repository;

public interface IZipFileRepository {
    
    void zipFile();
    
    boolean compressTo(String pathSrc, String fileZipName,String pathCompress);
    
    void unzipFile();
    
    boolean extractTo(String pathZipFile, String pathExtract);
}
