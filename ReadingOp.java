import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileReader;

public class ReadingOp {
    public static void main(String[] args) throws Exception {
        File dir= new File("PwJava");
        File file = new File(dir,"pwsills.txt");

        FileReader fr = new FileReader(file);
        int i =fr.read();
        System.out.println((char) i);
        while(i!=-1){
            System.out.println((char) i);
            i=fr.read();
        }
    }
}
