package com.biz.controller;

import com.biz.model.ScoreVO;

public class Score_Exec_02 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 2개의 배열을 생성
		// 각각 배열에 2명의 성적을 저장
		ScoreVO[] sVOs = new ScoreVO[2];			// 배열생성
		// 생성된 배열에 각각 2명의 성적을 저장
		sVOs[0] = new ScoreVO();
		sVOs[0].setNumber("1");
		sVOs[0].setName("홍길동");
		sVOs[0].setKor(90);
		sVOs[0].setEng(88);
		sVOs[0].setMath(70);
		System.out.println(sVOs[0].toString());

		// 총점계산
		int intTotal = sVOs[0].getKor();			// 값을 불러오고
		intTotal += sVOs[0].getEng();				// kor + eng
		intTotal += sVOs[0].getMath();				// kor + eng + math
		
		sVOs[0].setTotal(intTotal);  				// 합을 토탈에 저장
		sVOs[0].setAverage(intTotal / 3);			// 평균값 ave저장
		
		sVOs[1] = new ScoreVO();
		sVOs[1].setNumber("2");
		sVOs[1].setName("성춘향");
		sVOs[1].setKor(70);
		sVOs[1].setEng(98);
		sVOs[1].setMath(90);
		System.out.println(sVOs[1].toString());

		
	}

}
