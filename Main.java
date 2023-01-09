import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n=0;
		int k=0;
		for(int i=0;i<num;i++) {
			n =sc.nextInt();
			k =sc.nextInt();
			doCase(n,k);
		}
		
		
	}

	private static void doCase(int n, int k) {
		ArrayList<String> list = combination(n,k);
			System.out.println("	The bit patterns are");
			for(String s: list) {
			System.out.println(s);
			}
		}
	

	private static ArrayList<String> combination(int n, int k) {
		ArrayList<String> list = new ArrayList<>();
		if(k>n) {
			return list;
		}
		if(k==n) {
			String s = "";
			for(int i=0;i<n;i++) {
				s+="1";
			}
			list.add(s);
			return list;
		}
		if(k==0) {
			String s = "";
			for(int i=0;i<n;i++) {
				s+="0";
			}
			list.add(s);
			return list;
		}
		ArrayList<String> subList = combination(n-1,k-1);
		for(String s: subList) {
			list.add("1"+ s);
			
		}
		subList = combination(n-1,k);
		for(String s: subList) {
			list.add("0"+s);
		}
		return list;
	}

	
	

}
