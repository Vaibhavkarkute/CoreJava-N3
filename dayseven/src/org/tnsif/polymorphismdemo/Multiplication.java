package org.tnsif.polymorphismdemo;

public class Multiplication {
	//Method overlaoding in terms of by changing the datatype
	int mul(int x,int y) {
		return(x*y);
	}
	int mul(float x,int y) {
		return (int)(x*y);
	}


}
