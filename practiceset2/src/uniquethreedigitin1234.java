public class uniquethreedigitin1234 {
    public static void main(String[] args) {
        int i,j,k,x=0;
        for (i=1;i<4;i++)
        {
            for (j=1;j<4;j++)
            {
                for (k=1;k<4;k++)
                {
                    if(k!=i || i!=k||j!=i||j!=k)
                    {
                        x++;
                    }
                }
            }
        }
        System.out.println("total number :"+x);
    }
}
