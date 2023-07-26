import java.util.*;
import java.io.*;
public class 잃어버린괄호1541 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numlist = br.readLine();

        int sum = 0;
        String[] minus = numlist.split("\\-");

        String[] plus = minus[0].split("\\+");
        for (String num : plus) {
            sum += Integer.parseInt(num);
        }

        // 나머지 서브 식들은 뺄셈으로 계산
        for (int i = 1; i < minus.length; i++) {
            String[] subExpression = minus[i].split("\\+");
            for (String num : subExpression) {
                sum -= Integer.parseInt(num);
            }
        }

        System.out.println(sum);




    }
}
