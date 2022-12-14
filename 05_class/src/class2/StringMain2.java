package class2;

import java.util.Scanner;

public class StringMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String x = sc.next();
		System.out.print("현재 문자열 입력 : ");
		String now = sc.next();
		System.out.print("바꿀 문자열 입력 : ");
		String change = sc.next();
		int count = 0;
		while(true) {
			String z = x.toLowerCase();
			if(x.length()<now.length()) {
				System.out.println("입력한 문자열의 크기가 작습니다\r\n"
						+ "치환 할 수 없습니다");
				break;
			}
			for(int i=0; i<z.length(); i++) {
				for(int j=now.length()+i; j<z.length(); j++) {
					if(now.equals(z.substring(i, j))) {
						count++;
					}
				}
			}
			
			System.out.println(count+"개 치환");
			z = z.toLowerCase().replace(now, change);
			System.out.println(z);
			break;
			}
			
		
	}

}
/*
치환하는 프로그램을 작성하시오 - indexOf(), replace()//
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

indexOf()
replace()
*/