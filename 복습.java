import java.util.*;
import java.io.*;
public class 복습 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int fivebag = 5;
        int threebag = 3;
        int A=0 , B=0;

        while (N>=0){
            if(N%fivebag==0){
                A = N/fivebag;
                System.out.println(A+B);
                return;
            }
            N -= threebag;
            B++;

            if(N<0){
                System.out.println("-1");
                return;
            }

        }

    }
}
