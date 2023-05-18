package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		/*
		Hello hello = new Hello();
		hello.setData("hello");
		String data = hello.getData();

		System.out.println("data = " + data);

		SpringApplication.run(JpashopApplication.class, args);
		 */

		System.out.println("알파멧 하나를 쓰고 [Enter]키를 누르세요.");

		//아스키코드로 저장할 변수
		int i;

		// 입력 try-catch문
		try{
			i = System.in.read();  // -> read() 메서드로 한 바이트 읽음
			System.out.println(i);
			System.out.println((char)i); // -> 문자로 변환하여 출력

		}catch(IOException e){
			e.printStackTrace();

		}

	}

}
