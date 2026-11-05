package com.kh.chep02.model.duo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// 데이터를 보관하는 공간에 직접 접근해서 입 / 출력하는 메소ㅗ드들을 가즈고 있음
public class FileByteDao {
	
	// 출력 ; 프로그램내의 데이터를 밖으로 내보냄
	// 프로그햄 -- > 외부(파일)
	public void outputToFile() {
		
		// 파일로 데이터를 출력할 때 파일과 연결하는 1Byte짜로 바이트 스트림
		FileOutputStream fos = null;
		
		try {
		FileOutputStream fos1 = new FileOutputStream("a.txt");
		// 생성자 호출 시 파일명을 인자로 전달
		// 존재하지 않는 파일일 경우 파일을 새롭게 생성하면서 스트림 연결
		// 두 번째 인자값으로 ture를 전달하면 이어쓰기
		// 코드상에서 전부 사용 => 자원반납
		
		// 자원반납
		//.close();
		fos1.close();
		
		// 스트림을 통해 데이터 출력
		fos1.write(97);
		fos1.write(98);
		fos1.write(99);
		
		// 1Byte의 범위 -128~127
		// 바이트스트림으로 한글 해결할 수 없
		// 문자스트림 사용
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
		try {
			if(fos != null) {
				fos.close();
			}
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}
	}
	
	// 프로그램 <= 외부매체(파일)
	// 입력 : 데이터를 가지고 오겟다
	public void inputFromFile() {
		
		FileInputStream fis = null;
		try {
		fis = new FileInputStream("a.txt");
        //System.out.println(fis.read());
		// 반복문
		// 1. for / 2.while
		// while  
		
 
	/*	
		while(fis.read() != -1) {
			System.out.println(fis.read());
		}*/
		
		  while(true) {
			int value = fis.read();
			if(value != -1) {
				System.out.println((char)value);
			} else {
				break;
			} 
		
		}
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	} 
		try {
			fis.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}



