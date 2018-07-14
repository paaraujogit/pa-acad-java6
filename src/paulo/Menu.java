package paulo;

import java.util.Scanner;

public class Menu {
	public static String lerString() {
		String res;
		Scanner in = new Scanner(System.in);
	    res = in.nextLine();
		return res;
	}
	public static String lerStringMsg(String msg) {
		System.out.println(msg);
		return lerString();
	}
	public static int lerInt() {
		String saux;
		Scanner in = new Scanner(System.in);
	    saux = in.nextLine();
	    int ires = Integer.parseInt(saux);
		return ires;
	}
	public static int lerIntMsg(String msg) {
		System.out.println(msg);
		return lerInt();
	}
}
