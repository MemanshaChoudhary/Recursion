//Given a maze with a starting point and an ending point, we need to find all possible paths from the starting point to the ending point. In this variation, we can only move right, down and diagonally in the maze.
public class mazepathvoid2 {
   static void mazePathProblem(int row , int col, int endRow, int endCol, String result){
if(col==endCol && row==endRow){
    System.out.print(result + " ");
    return;
}
if(col>endCol || row >endRow){
    return;
}
mazePathProblem(row,col+1,endRow,endCol,result+ "R");
mazePathProblem(row+1,col,endRow,endCol,result + "D");
mazePathProblem(row+1,col+1,endRow,endCol,result + "I");

   }
   public static void main(String[] args) {
    mazePathProblem(0, 0, 2, 2, "");
   }
}


