package part01.sec01.exam02;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class RefTypeExample3_02 {

	public static void main(String[] args) {
//		Point obj; // 참조값 이없음.
//		System.out.println(obj.x);
//		System.out.println(obj.y);

		Point obj = null; // null도 하나의 값이다.하지만 비어있는.(= obj가 가리키는값이 없다(null이다))

		if (obj == null) {
			System.out.println("obj변수가 가리키는 객체가 없습니다.");
			return; // 반환값없이 main 종료해라.
			}
//			system.out.println(obj.x);
//			system.out.println(obj.y);
	}
}
