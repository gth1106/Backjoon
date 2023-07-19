import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 그리디브론즈 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Size = Integer.parseInt(br.readLine());
        int arr[]=new int[Size];
        for (int i = 0; i < Size; i++) {
            int C = Integer.parseInt(br.readLine());

            int quarters = C / 25; // 쿼터 개수 계산
            C %= 25; // C를 25로 나눈 나머지를 새로운 C로 갱신

            int dimes = C / 10; // 다임 개수 계산
            C %= 10; // C를 10으로 나눈 나머지를 새로운 C로 갱신

            int nickels = C / 5; // 니켈 개수 계산
            C %= 5; // C를 5로 나눈 나머지를 새로운 C로 갱신

            int pennies = C; // 페니 개수 계산

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
    }
}