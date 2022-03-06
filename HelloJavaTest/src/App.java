import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        // BufferedReaderを生成する。
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // 文字列の入力をもらう。
        System.out.println("文字列入力");
        String strValue = in.readLine();

        // 文字列を出力する。
        System.out.println("文字列出力：" + strValue );
    }
}
