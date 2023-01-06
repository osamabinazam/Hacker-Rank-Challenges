package Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int leftDiagonal =0; 
    int rightDiagonal =0;
    int row = arr.size();
    int col = arr.get(0).size();
    int count =row-1;
    int revCount= 3;
    
    System.out.println("Rows : " + row);
        System.out.println("Coulumns : " + col);
    //Primary Diagonal
    for (int i =0; i<row; i++){
        for(int j =0; j<col; j++){
            if(i==j){
                leftDiagonal+=arr.get(i).get(j);
            }
        }
    }
    //Secondary Diagonal
    for (int i =0; i<row; i++){
        for(int j =0; j<col; j++){
            if ((i+j) == (row-1) ){
                rightDiagonal+=arr.get(i).get(j);
                count--;;
                
            }
        
            
        }
    }
        System.out.println("Left Diagonal is : " + leftDiagonal);
        System.out.println("Right Diagonal is :  " + rightDiagonal );
        return Math.abs(leftDiagonal - rightDiagonal);
        

    }
    // private static int sumOfLeft (){
        
    // }

}

public class AbsoluteSumOfDiagonals {
    public static void main(String[] args) throws IOException {
        List <List<Integer>> values = new ArrayList<>();
        
    
        



        //Hacker Rank Generated Code

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // List<List<Integer>> arr = new ArrayList<>();

        // IntStream.range(0, n).forEach(i -> {
        //     try {
        //         arr.add(
        //             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                 .map(Integer::parseInt)
        //                 .collect(toList())
        //         );
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        // int result = Result.diagonalDifference(arr);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
