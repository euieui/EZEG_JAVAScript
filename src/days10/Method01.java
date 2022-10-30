package days10;
// Method : Function 이라고도 부르며, 간헐적으로 반복되는 코드 단위를 별도로
// 정의하고 그  이름 불러서 코드를 실행하는 단위코드.
// JAVA에서는 Function 이란 말보다 Method 라는 표현을 주로 사용합니다.
// 특징
// 1. 명령들이 모여서 기능을 정의 하는 단위.
// 2. 일련의 실행코드들을 묶어서 재활용
// 3. 메소드는 각 메서드 마다 고유한 이름이 있습니다.
// 4. 메서드가 이름이 불리워져서 실행되라는 명령을 받으면, 그 메서드의 몸체를 이루는
//		코드들이 실행되는 형식입니다.
// 5. 자바의 메서드는 이름 옆에 항상 괄호() 를 달고 나옵니다.

// 메소드의 생성: 반드시 클래스의 내부에서만 선언할 수 있습니다.
// 메소드는 선언된 이후, 메소드를 이름으로 호출해야만 메소드의 실행코드들이 실행됩니다.
public class Method01 {
	// 개발자 정의 메서드의 정의 위치는 main 의 위나 아래 모두 정의 가능합니다.
	public static void main(String[] args) {
		// --- java.leng ? 클래스에 System.out. 이 있고 거기에 println이 있다 무슨말이 인지 알겠나? import 생각해봐
		System.out.println("프로그램 시작"); // 1번
		myPrint(); // 2번
		// 메서드가 하나 호출되면, 메서드의 몸체로 포커스가 이동한뒤 그 몸체를 모두
		// 실행하고 원래 자리로 돌아옵니다.
		System.out.println("프로그램 종료"); // 3번

	}
	
	// 아래와 같이 정의하고, 위와 같이 이름 부르면 메서딍 몸체가 되는 코드가 실행됩니다.
	public static void myPrint() {
		System.out.println("내가 만든 Print 메서드 실행~~!!"); //2번
	}
	// --- C언어는 main 위에다가 만들어야 한다!! 자바는 알아서 인식을 해주네~ 좋네~
	
	
	
	// ---public static void 나중에 알게 될거야 main 밖에다가 만들기
	// ---main 도 메소드다!
	// ---public static void -> 함수만들기
	
}
