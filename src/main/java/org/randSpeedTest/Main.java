package org.randSpeedTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Main {

    private static final int WHOLE = 100;
    private static final int PARTIAL = 1000000;

    public static void main(String[] args) {
        double result = 0;
        double totalTime = System.nanoTime();
        int j;
        for (j = 1; j <= WHOLE; j++) {
            double partialTime = System.nanoTime();
            try {
                for (int i = 0; i <= PARTIAL; i++) {
                    new Random().nextInt(1000);
                    //Double r = Math.random();
                }
            } catch (Exception e) {
                return;
            }
            double partialTimeResult = (System.nanoTime() - partialTime) / 1000000000;
            result += partialTimeResult;
            BigDecimal partialTimeResultOutPut = new BigDecimal(partialTimeResult).setScale(7, RoundingMode.DOWN);
            System.out.println(j + "/" + WHOLE + " - " + partialTimeResultOutPut + "秒");

        }
        double totalTimeResult = (System.nanoTime() - totalTime) / 1000000000;
        BigDecimal totalTimeResultOutPut = new BigDecimal(totalTimeResult).setScale(7, RoundingMode.DOWN);
        BigDecimal averageOutPut = new BigDecimal(result / WHOLE).setScale(7, RoundingMode.DOWN);
        System.out.println("合計出力時間 : " + totalTimeResultOutPut + "秒");
        System.out.println("平均時間 : " + averageOutPut + "秒");



    }
}