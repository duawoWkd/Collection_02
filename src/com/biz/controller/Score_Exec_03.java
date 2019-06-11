package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Exec_03 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 10개의 배열을 생성하고
		// 번호는 순서대로 설정하고
		// 이름은 입력하지 않고
		// kor, eng, math 점수를 각각 난수로 생성해서 저장
		// 		단 점수는 51 ~ 100까지 임의의값
		// 입력(저장된)값을 콘솔에서 확인하고
		// 총점과 평균 계산해 봅시다.
		
		ScoreVO[] sVOs = new ScoreVO[10];
		Random rnd = new Random();
		for(int i = 0 ; i < sVOs.length; i++) {
			int s1 = rnd.nextInt(50)+51;
			int s2 = rnd.nextInt(50)+51;
			int s3 = rnd.nextInt(50)+51;
			
		sVOs[i] = new ScoreVO();
		sVOs[i].setNumber(""+(i+1));
		sVOs[i].setKor(s1);
		sVOs[i].setEng(s2);
		sVOs[i].setMath(s3);
		
		
		int intTotal = sVOs[i].getKor();
		intTotal += sVOs[i].getEng();
		intTotal += sVOs[i].getMath();
	
		sVOs[i].setTotal(intTotal);  				
		sVOs[i].setAverage(intTotal / 3);			
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(sVOs[i].toString());
		}
	}

}
