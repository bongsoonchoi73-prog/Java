package com.kh.chep02.model.duo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chep02.model.Message;

public class ObjectDao {
	
	// 출력
	// 객체 단위로 출력을 할 때 필요한 보조스림
	public void outputFile() {
		Message m = new Message("말이안됨");
		try(ObjectOutputStream fos
		          = new ObjectOutputStream(new FileOutputStream("e.txt"))){
		       fos.writeObject(m);
		          } catch(IOException e) {
		        	  e.printStackTrace();
		          }
	}

	private void inputFile() {
		try(ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream("e.txt"))){
			Message m = (Message) ois.readObject();
				
		
	} catch(IOException e) {
		e.printStackTrace();
	} catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	}

	}


