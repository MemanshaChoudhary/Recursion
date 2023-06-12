
import java.util.ArrayList;

public class mazepathproblem2 {
   static ArrayList<String> getmaze(int currRow, int currCol, int endRow, int endCol){

    if(currCol==endCol || currRow==endRow){
        ArrayList<String> finalResult = new ArrayList<>();
        finalResult.add("");
        return finalResult;
    }
     if(currCol>endCol || currRow>endRow){
        ArrayList<String> finalResult = new ArrayList<>();
        
        return finalResult;
    }
ArrayList<String> finalResult = new ArrayList<>();
    ArrayList<String> rightResult=getmaze(currRow, currCol+1, endRow, endCol);
for(String e : rightResult){
    finalResult.add("R" + e);
}

    ArrayList<String> downResult=getmaze(currRow+1, currCol, endRow, endCol);
for(String e : downResult){
    finalResult.add("D" + e);
}
ArrayList<String> diagonalResult=getmaze(currRow+1, currCol+1, endRow, endCol);
for(String e : diagonalResult){
    finalResult.add("I" + e);
}
return finalResult;
   }
    public static void main(String[] args) {
        ArrayList<String>ans =getmaze(0,0,2,2);
        System.out.println(ans);
    }
}
