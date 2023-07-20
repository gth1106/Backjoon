import java.io.*;
import java.util.*;
public class 그2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int A,B,C;
        if(T%10!=0){
            System.out.println("-1");
        }
        else {

            A = T/300;
            T %= 300;
            B = T/60;
            T %= 60;
            C = T/10;

            System.out.println(A+" "+B+" "+C);
        }

    }
}
