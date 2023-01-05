
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
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        List<Integer> copiedList = new ArrayList<Integer>();
        int size = a.size();
        for (int i = size-1; i>=0; i--){
            copiedList.add(a.remove(i));
        }
        return copiedList;

    }
    public static void print(List<Integer> a){
        List<Integer> copeidIntegers = new ArrayList<>();
        for(int i = 0; i<a.size(); i++)
            copeidIntegers.add(a.get(i));
        for (int  currentValue : copeidIntegers) {
            System.out.print(currentValue+" ");
        }
        System.out.println("");
    }
}

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        
        System.out.print("Reversed Array is : ");
        Result.print(Result.reverseArray(a));


        /*
         * Hecker Rank Generated Code
         */

    //     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    //     int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    //     List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
    //         .map(Integer::parseInt)
    //         .collect(toList());

    //     List<Integer> res = Result.reverseArray(arr);

    //     bufferedWriter.write(
    //         res.stream()
    //             .map(Object::toString)
    //             .collect(joining(" "))
    //         + "\n"
    //     );

    //     bufferedReader.close();
    //     bufferedWriter.close();
    }
}
