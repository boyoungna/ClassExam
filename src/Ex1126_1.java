
public class Ex1126_1 {

	public static void main(String[] args) {
		// 배열 테스트
		int[] stIDs = new int[10];	// 정수형 배열 선언 (초기화 하지 않음)
		
		int[] stArr1 = {101, 102, 103, 104, 105};	// 배열 선언과 동시에 초기화
		int[] stArr2 = new int[] {101, 102, 103, 104, 105};	//위와 동일. new int 옆에 개수 쓰면 안됨.
		
		int[] stArr3;	//선언. 2줄에 나눠씀
		stArr3 = new int[] {101, 102, 103};	//new 생략 불가
		
		for (int i = 1; i < 5; i++) {	// 0~4 까지 반복 0,1,2,3,4
			System.out.println(stArr1[i]);	// 인덱스는 0부터 시작함
		}
		
		// 반복문장에서는 i변수(정수)를 많이 사용. 다른 변수값에 영향을 주지 않기때문? index=i
		for (int i = 0; i < 3; i++) {	
			System.out.println(stArr1[i]);	
		}
		
		
	}

}
