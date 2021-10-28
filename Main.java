package example5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//배열
		int[] arr = new int[10]; // 0 //배열의 한계 = 길이가 고정되어 있다, 추가x, 삭제x, 공간을 효율적사용x 알고리즘 구현
         //배열을 적게 만들면 데이터 저장을 많이 못한다.
		
		//배열의 한계 해결 = ArrayList
		
		Scanner sc = new Scanner(System.in);
		
		// 리스트  =>컨트롤(좌) + 쉬프트(좌) + o        Integer = int
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//변수, 배열 -> 데이터를 관리(추가, 삭제, 조회, 수정)
		
		//리스크 크기 확인 -> size()
		
		System.out.println(list.size());
		
		//추가 -> list.add(value); 가장 마지막 요소 뒤에 추가
		list.add(100);
		System.out.println(list.size());
		list.add(200);
		System.out.println(list.size());
		list.add(300);
		System.out.println(list.size());
		
		//조회(데이터 가져오기) -> list.get(index);
		System.out.println(arr[0]);
		System.out.println(list.get(1));
		
		//삭제 -> list.remove(index);
		list.remove(1);
		System.out.println(list.get(1));
		
		//수정 -> list.set(index, value);
				list.set(0, 1000);
				System.out.println(list.get(0));
		
		
		
	}

}
