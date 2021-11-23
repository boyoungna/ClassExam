
public class ScoreTest {

	public static void main(String[] args) {
		
	Score s1 = new Score();
	System.out.println(s1.getName() + "의 국어 점수는 " + s1.getkor() +"이고, 영어 점수는 " + s1.geteng() +"이고, 수학 점수는 " + s1.getmath() + "이다.");
	System.out.println(s1.getName() + "의 평균은" +s1.getAvg() + "이다.");
	
	Score s2 = new Score("이도령", 84, 91, 79);
	System.out.println(s2.getName() + "의 국어 점수는 " + s2.getkor() +"이고, 영어 점수는 " + s2.geteng() +"이고, 수학 점수는 " + s2.getmath() + "이고, 총점은 " + s2.getTotal() +  "이고, 평균은 " + s2.getAvg() + "이다.");
	
	Score s3 = new Score();
	s3.setname("강보영");
	s3.setkor(100);
	s3.seteng(56);
	s3.setmath(68);
	System.out.println(s3.getName() + "의 국어 점수는" + s3.getkor() +"이고, 영어 점수는" + s3.geteng() +"이고, 수학 점수는" + s3.getmath() + "이다.");
	System.out.println(s3.getName() + "의 총점은" + s3.getTotal() + "이고");
	System.out.println(s3.getName() + "의 평균은" + s3.getPg() + "이다.");
	
	Score s4 = new Score();
	s4.setname("해리콜라");
	s4.setkor(30);
	s4.seteng(0);
	s4.setmath(10);
	System.out.println(s4.getName() + "의 국어 점수는" + s4.getkor() +"이고, 영어 점수는" + s4.geteng() +"이고, 수학 점수는" + s4.getmath() + "이다.");
	System.out.println(s4.getName() + "의 총점은" + s4.getTotal() + "이고");
	System.out.println(s4.getName() + "의 평균은" + s4.getPg() + "이다.");
	
	System.out.println(s4.getName() + "의 평균은" +s4.getAvg() + "이다.");
	
	
	}

}
