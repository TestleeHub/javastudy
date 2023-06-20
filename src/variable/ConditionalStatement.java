package variable;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		/*
		 * Test1. if문을 이용한 학점 구하기
		 * 1. 점수는 score 변수, 학점은 grade변수 사용
		 * 2. 점수가 90점 이상이면 A학점
		 * 	  점수가 80점 이상이면 B학점
		 * 	  점수가 70점 이상이면 C학점
		 * 	  점수가 60점 이상이면 D학점
		 *	  점수가 60점 미만이면 F학점
		 *    100점보다 크거나 0점 보다 작을 경우 "잘못된 점수 입니다."
		 * 3. 결과 출력 => 점수 : 80, 학점 B
		 */
		Scanner scan = new Scanner(System.in); // System.in :콘솔에서 입력을 받겠다
		System.out.print("점수를 입력하시오 (0~100) :");
		int score = scan.nextInt();
		char grade = ' ';
		if(score >=0 && score <= 100) {
			if(score >= 90) {
				grade = 'A';
			}
			else if(score >= 80) {
				grade = 'B';
			}
			else if(score >= 70) {
				grade = 'C';
			}
			else if(score >= 60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			System.out.println("점수 : " + score + ", " + grade + "학점");
		}
		else {
			System.out.println(score + "는 잘못된 점수 입니다.");
		}

		System.out.print("점수를 입력하시오 (0~100) :");
		score = scan.nextInt();
		grade = ' ';
		if(score >=0 && score <= 100) {
			switch(score / 10) {
				case 9 : grade = 'A';
					break;
				case 8 : grade = 'B';
					break;
				case 7 : grade = 'C';
					break;
				case 6 : grade = 'D';
					break;
				default : grade = 'F';
			}

			System.out.println("점수 : " + score + ", " + grade + "학점");
		}
		else {
			System.out.println(score + "는 잘못된 점수 입니다.");
		}
		//자원 해제
		scan.close();
	
	}

}
