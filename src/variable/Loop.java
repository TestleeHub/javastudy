package variable;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		System.out.println("***Whil문 구구단 출력***");
		Scanner scan = new Scanner(System.in);
		System.out.print("단 수를 입력하세요 : ");
		int dan = scan.nextInt();
		int i = 1;
		
		System.out.println("===" + dan + "단===");
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		
		System.out.println("***for문 구구단 출력***");
		
		for(int dan1 = 2; dan1 <= 9; dan1 ++) {
			System.out.println("===" + dan1 + "단===");
			for(int j = 1; j <= 9; j++) {
				System.out.println(dan1 + " * " + j + " = " + (dan1 * j));
			}
		}
		System.out.println("========");
		scan.close();
	}
}
