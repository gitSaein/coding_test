package main.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class LottoUtil<T> {

    public ArrayList<Integer> setRandomDataListByType(int cnt) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < cnt; i++) {
            list.add(random.nextInt(45) + 1);
        }
        return list;
    }

    public void printData(ArrayList<T> list) {

        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            System.out.print("[" + it.next() + "]");
        }
    }
}