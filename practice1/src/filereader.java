import java.io.FileReader;

public class filereader {
    public static void main(String[] args) {
        try {
            FileReader r=new FileReader("C:\\vishal\\x.txt");
            try {
                int i;
                while ((i=r.read())!=-1)
                {
                    System.out.print((char) i);
                }
            }
            finally {
                r.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
