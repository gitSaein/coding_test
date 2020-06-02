package main.ex;

import java.util.ArrayList;

import main.util.LottoUtil;

class Solution1 {

	public static void main(String[] args) {

		LottoUtil<Integer> lotto = new LottoUtil<Integer>();

		ArrayList<Integer> lottoNumList = lotto.setRandomDataListByType(6);
		lotto.printData(lottoNumList);
	}
}
