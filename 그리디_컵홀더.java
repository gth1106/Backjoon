import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 그리디_컵홀더 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String seat = br.readLine();
        String str = "";
        int cnt=1;
        for(int i=0;i<T;i++){
            if(seat.charAt(i)=='S'){
                str += "*S" ;  // 컵홀더 일반석
            }
            else {
                str += "*LL";  // 컵홀더 커플석
                i++;
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                cnt++;
            }
        }
        cnt = Math.min(cnt,T);
        System.out.println(cnt);
    }
}
