//Given a maze with a starting point and an ending point, we need to find all possible paths from the starting point to the ending point. In this variation, we can only move right or down in the maze.
// Maze path problem with void as datatype 
public class mazePathvoid {
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

   }
   public static void main(String[] args) {
    mazePathProblem(0, 0, 2, 2, "");
   }
}
