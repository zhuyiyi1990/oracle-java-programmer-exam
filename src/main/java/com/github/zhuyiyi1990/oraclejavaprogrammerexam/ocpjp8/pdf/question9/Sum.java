package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question9;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Sum extends RecursiveAction {

    static final int THRESHOLD_SIZE = 10;

    int stIndex, lstIndex;

    int[] data;

    public Sum(int[] data, int start, int end) {
        this.data = data;
        this.stIndex = start;
        this.lstIndex = end;
    }

    @Override
    protected void compute() {
//        System.out.println(Thread.currentThread().getName());
        System.out.println("stIndex:" + stIndex + ",lstIndex:" + lstIndex);
        int sum = 0;
        if (lstIndex - stIndex <= THRESHOLD_SIZE) {
            for (int i = stIndex; i < lstIndex; i++) {
//                System.out.print(data[i] + " ");
                sum += data[i];
            }
//            System.out.println();
            System.out.println(sum);
        } else {
            new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
            new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool fjPool = new ForkJoinPool();
        int[] data = new int[10000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
        fjPool.invoke(new Sum(data, 0, data.length));
    }

}
