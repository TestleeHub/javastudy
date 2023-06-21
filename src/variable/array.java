package variable;

public class array {
	public static void main(String[] args) {
		// 배열자료형[] 배열명 = new 배열자료형[배열갯수];
		// 배열명[index] = 값;
		int[] score = new int[5];
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;

		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " + score[i]);
		}

		System.out.println("-------------------");
		// 배열자료형[] 배열명 = {1,2,3,4,5};

		int[] arr = { 60, 70, 80, 90, 100 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		

		/*
		 * [향상된 for문] => 중요
		 * 배열의 처음부터 끝까지 모든 요소를 참조 할때 사용하는 반복문
		 * 배열 요소값을 순서대로 하나씩 가져와서 변수에 대입한다.
		 * 따로 초기화와 종료 조건이 없기 때문에 모든배열의 시작 요소부터 끝요소까지 실행한다
		 * 
		 * for(배열자료형 변수: 배열명){
		 * 	반복실행문;
		 * }
		 */
		String[] strArray = {"녹차","쥬스","홍차","커피","두유"};
		
		//for문
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println();
		
		//향상된 for문
		for (String str : strArray) {
			System.out.println(str);
		}
		
		System.out.println();
	}
}
