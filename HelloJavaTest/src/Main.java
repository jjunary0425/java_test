import java.util.*;


public class Main {
	public static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int cnt = sc.nextInt();
		// スペース区切りの整数の入力
		int yesterday = sc.nextInt();

		String output = "";

		for (int i = 0 ; i < cnt; i++){
			int today = sc.nextInt();
			int diff = today - yesterday;
			if (diff == 0){
				output = output+"stay";
			}else if (diff < 0){
				int absolute = diff * -1;
				output = output+"down " + absolute;
			}else{
				output = output+"up " + diff;
			}
				output = output + LINE_SEPARATOR;
				yesterday = today
		}

		// 文字列の入力
		// String s = sc.next();
		// 出力
		System.out.print(output);
	}
}
