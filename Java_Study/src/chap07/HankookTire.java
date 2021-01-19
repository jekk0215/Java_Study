package chap07;
// Tire의 자식 클래스
public class HankookTire extends Tire {

	// 필드
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulateRotation; // 누적 회전수 1 증가
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + 
				(maxRotation-accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
}
