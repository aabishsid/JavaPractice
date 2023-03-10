package com.functional.interFace;

public class SquareFuncInterFace1 {

	public static void main(String[] args) {
		SquareFuncInterface sq = n -> n*n;
		System.out.println(sq.squareIt(89));
		System.out.println(sq.squareIt(8));
		System.out.println(sq.squareIt(5));

	
	}  
  
}
