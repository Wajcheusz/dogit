package dogit;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Dane dane = new Dane();
		list.add("costam");
		dane.print(list, 0);
		list.add("costam2");
		dane.print(list, 1);	
	}

	
}
