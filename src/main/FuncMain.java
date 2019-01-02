package main;

import function.stackAndQue.StickLengthFunc;

public class FuncMain {

	public static void main(String[] args) {

		String in = "()(((()())(())()))(())";
		StickLengthFunc func = new StickLengthFunc();
		func.inputStack(in);
	}

}
