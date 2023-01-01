import java.util.* ;

class sparse 
{
    private int k=1;
    private int[][] sp = new int[10][3];

    public void create_sparse(int row, int col, int [][] mat)
    {
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row and coloumn : ");
       

        
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
    }
    public void display()
    {
        System.out.println("Your sparse matrix is :");

        for(int i=0; i<k; i++)
        {
            System.out.println(sp[i][0] + "\t" + sp[i][1] + "\t" + sp[i][2]);
        }
    }
};

public class Sparse_operation {
    public static void main(String[] args)
    {
        int row, col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column : ");
        row = sc.nextInt();
        col = sc.nextInt();
        
        int[][] mat = new int[10][10];
        System.out.println("Enter matrix elements : ");

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        sparse s = new sparse();
        s.create_sparse(row, col, mat);
        s.display();

        
        

        

       
        sc .close();

    }

}
