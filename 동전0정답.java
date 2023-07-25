import java.util.*;
import java.io.*;

public class 동전0정답 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            cnt += K / arr[i]; // 해당 가치의 동전으로 만들 수 있는 개수를 더함
            K %= arr[i]; // 해당 가치의 동전으로 만들고 남은 나머지 금액
        }

        System.out.println(cnt);
    }
}
