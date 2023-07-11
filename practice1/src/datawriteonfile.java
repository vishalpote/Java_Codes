import java.io.FileWriter;

public class datawriteonfile {
    public static void main(String[] args) {
        try {
            FileWriter  w=new FileWriter("C:\\vishal\\x.txt");
            try {
                w.write("hello vishal how are you what are you doing brother");
            }
            finally {
                w.close();
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}