package me.wangkang.springboot.course.Chapter3_1_6.exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}

}
