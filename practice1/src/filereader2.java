import java.io.FileReader;

public class filereader2 {
    public static void main(String[] args) throws Exception {
        FileReader r=new FileReader("C:\\vishal\\x.txt");

        int i;
        while ((i=r.read())!=-1)
        {
            System.out.print((char) i);
        }
    }
}
