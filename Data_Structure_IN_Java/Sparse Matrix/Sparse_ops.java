import java.util.* ;

public class Sparse_ops {
    public static void main(String[] args)
    {
        int row, col;
        int[][] sp = new int[10][3];
        int[][] mat = new int[10][10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix row and coloumn : ");
        row = sc.nextInt();
        col = sc.nextInt();

        System.out.println("Enter matrix elements : ");

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        int k=1;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(mat[i][j] != 0)
                {
                    sp[k][0] = i ;
                    sp[k][1] = j ;
                    sp[k][2] = mat[i][j];
                    k++ ;
                }
            }
        }

        sp[0][0] = row;
        sp[0][1] = col;
        sp[0][2] = (k-1) ;

        System.out.println("Your sparse matrix is :");

        for(int i=0; i<k; i++)
        {
            System.out.println(sp[i][0] + "\t" + sp[i][1] + "\t" + sp[i][2]);
        }
        sc.close();

    }

}
