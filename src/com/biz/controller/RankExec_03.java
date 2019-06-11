package com.biz.controller;

import java.util.Random;

public class RankExec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] intTotal = new int[10];

		Random rnd = new Random();
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1;
			intKor[i] = rnd.nextInt(50) + 51;
			intEng[i] = rnd.nextInt(50) + 51;
			intMath[i] = rnd.nextInt(50) + 51;
		}
		for(int i = 0; i < intNum.length; i++) {
			intTotal[i] += intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
		}
		for(int i = 0; i < intTotal.length; i++) {
			for(int j = i+1; j < intTotal.length; j++ ) {
				if(intTotal[i] > intTotal[j]) {
					int _total= intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _total;
					
					int _number = intNum[i];
					intNum[i] = intTotal[j];
					intNum[j] = _number;
					
					int _intKor= intKor[i];
					intKor[i] = intTotal[j];
					intKor[j] = _intKor;
					
					int _intEng= intEng[i];
					intEng[i] = intTotal[j];
					intEng[j] = _intEng;
					
					int _intMath = intMath[i];
					intMath[i] = intTotal[j];
					intMath[j] = _intMath;




				}
			}
		}
	}
}
