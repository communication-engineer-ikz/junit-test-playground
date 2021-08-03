package junit.tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	public static String toSnakeCase(String str) {
		//1文字ずつ取得
		// refs. https://chibicat.hatenablog.jp/entry/2018/06/19/230333
		String[] stringArray = str.split("");
		String newStr = "";

		for (int i = 0; i < str.length() ; i++) {
			String s = stringArray[i];
			
			//refs. https://www.javadrive.jp/start/regex/index4.html
			String regex = "[A-Z]";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(s);
		
			//もし大文字だったら小文字
			if (m.find()) {
				//refs. https://www.javadrive.jp/start/string/index14.html
				s = s.toLowerCase();
				
				//先頭以降の大文字の前にはアンダースコア追加
				if (i > 0) {
					s = "_" + s;
				}
			}
			
			newStr = newStr + s;
		}
		return newStr;
	}
}
