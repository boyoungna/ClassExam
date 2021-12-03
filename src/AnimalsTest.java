import java.util.ArrayList;

class Animals {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animals {
	public void move() {    //메서드 오버라이딩(Overriding)
		System.out.println("사람이 움직입니다.");
	}
	public void readBook() {
		System.out.println("책을 읽는다.");
	}
}
class Tiger extends Animals {
	public void move() {    //메서드 오버라이딩(Overriding)
		System.out.println("호랑이 움직입니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}
class Eagle extends Animals {
	public void move() {    //메서드 오버라이딩(Overriding)
		System.out.println("독수리 움직입니다.");
	}
	public void frying() {
		System.out.println("독수리가 날아간다.");
	}
}

public class AnimalsTest {	//파일명과 동일한 클래스는 public 필요(단 1개)
	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest();
	   
		Animals[] animalArr = new Animals[10];	//배열 객체 생성
		for (int i = 0; i < 3; i++) {
		   animalArr[i] = new Human();
		}
		for (int i = 3; i < 5; i++) {
			animalArr[i] = new Tiger();
		}
		for (int i = 5; i < 10; i++) {
			animalArr[i] = new Eagle();
		}
	   //move 메서드 호출
		
		/*
		for (int i = 0; i < animalArr.length; i++) {
			animalArr[i].move();
		}
	   
		for (int i = 0; i <10; i++) {
			aTest.moveAniaml(animalArr[i]);
		}
		*/
	      
//	   aTest.moveAniaml(new Human());
//	   aTest.moveAniaml(new Tiger());
//	   aTest.moveAniaml(new Eagle());
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		ArrayList<Animals> aniList = new ArrayList<Animals>();
		aniList.add(new Human());	//객체 생성하면서 배열에 추가
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		for (Animals item : aniList) {
			item.move();	//다형성에 의해 각각의 메서드 호출
		}
		for (int i = 0; i < aniList.size(); i++) {
			Animals item = aniList.get(i);
			if (item instanceof Human) {
				Human h = (Human)item;	//다운캐스팅
				h.readBook();	//다운ㅐ스팅 되었으므로 독립된 메서드 사용 가능

			} else if (item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.hunting();	
			}else if (item instanceof Eagle) {
				Eagle e = (Eagle)item; 
				e.frying();
			} else {
				System.out.println("알 수 없는 오류입니다.");
			}
				
		}
		
	
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
	}	

   
	public void moveAniaml(Animals animal) {
		animal.move();	//다형성, 실제로 다른 일을 실행
	}

}

