package classStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudy {
	public static void main(String[] args) {
		//선언
		List<String> list = new ArrayList<String>();// 다형성 적용
		list.add("1번");
		list.add("2번");
		list.add("3번");
		
		System.out.println("방법1. for 문으로 출력");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("방법2. 향상된 for 문으로 출력");
		for(String str : list) {
			System.out.println(str);
		}
		
		   // 방법3. 반복자(Iterator) 지정하기
	      /*
	       * 사용목적 : 반복자는 java.util 패키지에 정의되어 있는 Iterator 인터페이스를 구현하는 객체이다.
	       *          즉 컬렉션의 원소들에 접근하는 것이 목적이다.
	       * 사용메서드
	       * - hasNext() : 아직 접근하지 않은 요소가 있으면 true를 반환
	       * - next() : 다음 요소를 반환.. Object 타입을 반환 => Object : 가장 큰 자료형
	       * - remove() : 최근에 반환된 요소를 삭제한다. 
	       */
		System.out.println("방법3. 반복자(itrator) 지정 후 출력");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {//ArrayList의 값이 존재하는 지 체크
			String  str = (String)it.next(); // Iterator타입 생략시 기본이 Object형(최상위 클래스)
			System.out.println(str);
		}
	}
}
