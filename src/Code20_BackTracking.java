import java.util.ArrayList;
import java.util.List;

public class Code20_BackTracking {
    static  void permutation(String str, String perm, int idx, List<String> ans){
        if(str.length()==0){
            ans.add(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            permutation(newstr,perm+currchar,idx+1,ans);
        }
    }
    static boolean isSafe(int newx,int newy,int[][]visited,int[][]arr,int n){
        if((newx>=0 && newx<n )&& (newy>=0 && newy<n ) && visited[newx][newy]!=1 && arr[newx][newy]==1){
            return true;
        }
        return false;
    }
    static  void rateInMaze(int x,int y,int[][]arr,int n,int[][]visited,String path){
        // base case
        if(x==n-1 && y==n-1){
            System.out.println(path);
            return;
        }
        visited[x][y]=1;
        //down
        if(isSafe(x+1,y,visited,arr,n)){
            rateInMaze(x+1,y,arr,n,visited,path+'D');
        }
        //left
        if(isSafe(x,y-1,visited,arr,n)){
            rateInMaze(x,y-1,arr,n,visited,path+'L');
        }
        //Right
        if(isSafe(x,y+1,visited,arr,n)){
            rateInMaze(x,y+1,arr,n,visited,path+'R');
        }
        //Up
        if(isSafe(x-1,y,visited,arr,n)){
            rateInMaze(x-1,y,arr,n,visited,path+'U');
        }
        visited[x][y]=0;
    }
    public static boolean isSafeQ(int row,int col,char[][]board){
        //Horizontal
        for(int j=0;j< board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        // Vertical
        for(int i=0;i< board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // Upper Right
        r=row;
        for(int c=col;c< board.length && r>=0;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //Lower left
        r=row;
        for(int c=col;c>=0 && r< board.length;c--,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // Lower right
        r=row;
        for(int c=col;c< board.length && r< board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][]board,List<List<String>>allBoard){
        String row="";
        List<String>newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                    row+='Q';
                else
                    row+='.';
            }
            newboard.add(row);
        }
        allBoard.add(newboard);
    }
    public static void helper(char[][]board,List<List<String>>allBoard,int col){
        if(col== board.length){
            saveBoard(board,allBoard);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafeQ(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoard,col+1);
                board[row][col]='.';
            }
        }

    }


    public static List<List<String>> solveNQueens(int n){
        List<List<String>>allBoard=new ArrayList<>();
        char[][]board=new char[n][n];
        helper(board,allBoard,0);
        return allBoard;
    }
    public static void main(String[] args) {

        //Que-1 permutation of a string
        String str="ABC";
        System.out.println("All possible permutation of string");
        ArrayList<String> ans=new ArrayList<>();
        permutation(str,"",0,ans);
        System.out.println(ans);

        //Que-2 rate in a maze using backtracking
        int arr[][]=   {{1, 0, 0, 0}, {1,1,0,0},{1,1,0,0},{0,1,1,1}};
        int[][]visited=new int[arr.length][arr.length];

        if(arr[0][0]==0){
            System.out.println("Sorry can't reach till the destiny");
        }
        else{
            rateInMaze(0,0,arr, arr.length,visited,"");
        }
        //Que-3 N-queen using backtracking

        System.out.println("Enter size of square matrix");
        int n=4;
        System.out.println(solveNQueens(n));
    }
}
