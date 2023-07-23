import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
public class 그리디_ATM11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int [N];
        String[] input = br.readLine().split(" ");
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int totaltime=0;
        int linetime=0;
        for (int i=0;i<arr.length;i++){
            linetime += arr[i];
            totaltime += linetime;
        }
        System.out.println(totaltime);


    }
}
