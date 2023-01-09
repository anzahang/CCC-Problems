import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[][] replace = new String[n][2];
		for(int i=0;i<n;i++) {
			replace[i][0] = sc.next();
			replace[i][1] = sc.next();
		}
		sc.nextLine();
		String phrase = sc.nextLine();
		
		for(int i=0;i<n;i++) {
			String regex1 = "\\b"+replace[i][1]+"\\b";
			phrase = phrase.replaceAll(regex1,replace[i][0]);
		}
		System.out.println(phrase);
	}

}
