import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code11_2dArray {
    public static int[] search(int[][]arr,int row,int col,int n){
        int[]ans=new int[2];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==n){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        int ans1[]=new int[1];
        ans1[0]=-1;
        return ans1;
    }

        public static List<Integer> spiralOrder(int[][] matrix)
        {
            List<Integer> ans = new ArrayList<Integer>();

            if (matrix.length == 0)
                return ans;

            int m = matrix.length, n = matrix[0].length;
            boolean[][] seen = new boolean[m][n];
            int[] dr = { 0, 1, 0, -1 };
            int[] dc = { 1, 0, -1, 0 };
            int x = 0, y = 0, di = 0;

            // Iterate from 0 to R * C - 1
            for (int i = 0; i < m * n; i++) {
                ans.add(matrix[x][y]);
                seen[x][y] = true;
                int cr = x + dr[di];
                int cc = y + dc[di];

                if (0 <= cr && cr < m && 0 <= cc && cc < n
                        && !seen[cr][cc]) {
                    x = cr;
                    y = cc;
                }
                else {
                    di = (di + 1) % 4;
                    x += dr[di];
                    y += dc[di];
                }
            }
            return ans;
        }
        public  static void transposeVal(int[][]matrix,int row,int col){
            for(int i=0;i<col;i++){
                for(int j=0;j<row;j++){
                    System.out.print(matrix[j][i]+" ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row=sc.nextInt();
        System.out.println("Enter col");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        System.out.println("Enter 2d array element");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter search element");
        int x=sc.nextInt();
        System.out.println("Search element is at index=("+ (search(arr, row, col, x))[0]+","+(search(arr, row, col, x))[1]+")");

        System.out.println("output of matrix in spiral form ="+spiralOrder(arr));

        System.out.println("Transpose matrix");
        transposeVal(arr,row,col);
    }
}
