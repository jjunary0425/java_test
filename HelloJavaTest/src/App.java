import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("文字列入力");
        String strValue = in.readLine();
        System.out.println("文字列出力：" + strValue );
    }
}
