package function.stackAndQue;

/*
 * Title: 쇠 막대기와 레이저의 배치
 * url  : https://programmers.co.kr/learn/courses/30/lessons/42585?language=java
 */
public class StickLengthFunc {
	public int inputStack(String in) {
		
		int inSize = in.length();
		StackFunc stackFunc = new StackFunc(inSize);
		while (!in.isEmpty()) {
			System.out.println("[Stick] Start Function...");
			for(int i=0; i < inSize; i++) {
				if(i == 0 || (i != 0 && in.charAt(i) == in.charAt(i-1))) {
					stackFunc.push(in.charAt(i));
				}else if(in.charAt(i) != in.charAt(i-1)) {
					stackFunc.pop();
				}else {
					System.out.println("StickLengthFunc others...");
				}
			}
			
		}
		return 0;
	}
	
	public int cutStickCnt() {
		
		return 1;
	}
}
