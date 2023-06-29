package classStudy;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {

	public static void main(String[] args) {

		// 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "홍길동");
		map.put(2, "임꺽정");
		map.put(3, "황진이");
		map.put(4, "강태공");

		// 데이터 가져오기
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}

		System.out.println("황진이 가져오기");
		System.out.println(map.get(3));

		// 데이터 삭제 : remove(key)
		System.out.println("강태공 데이터 삭제 후 전체 데이터 가져오기");
		map.remove(4);
		for (int i = 1; i <= map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		// 데이터가 비어 있는지 여부 : isEmpty()
		System.out.println("데이터가 비어 있는지 여부 : isEmpty()");
		System.out.println(map.isEmpty());
		
		System.out.println("해당 키가 있는지 여부 : containsKey()");
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsKey(4));
		 
		System.out.println("해당 값이 있는지 여부 : containsValue()");
		System.out.println(map.containsValue("홍길동"));
		System.out.println(map.containsValue("임꺽정"));
		System.out.println(map.containsValue("황진이"));
		System.out.println(map.containsValue("강태공"));
		
		System.out.println("해당 갯수 : size()");
		System.out.println(map.size());
	}

}
