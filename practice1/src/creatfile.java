import java.io.File;

public class creatfile {
    public static void main(String[] args) throws Exception{
        File f=new File("C:\\vishal\\x.txt");
            if(f.createNewFile())
            {
                System.out.println("file create succesfully..");
            }
            else {
                System.out.println("file already exists...");
            }
    }
}
