package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question9;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class Sum extends RecursiveAction {

    static final int THRESHOLD_SIZE = 3;

    int stIndex, lstIndex;

    int[] data;

    public Sum(int[] data, int start, int end) {
        this.data = data;
        this.stIndex = start;
        this.lstIndex = end;
    }

    @Override
    protected void compute() {
        System.out.println(Thread.currentThread().getName());
        int sum = 0;
        if (lstIndex - stIndex <= THRESHOLD_SIZE) {
            for (int i = stIndex; i < lstIndex; i++) {
                System.out.print(data[i] + " ");
                sum += data[i];
            }
            System.out.println();
            System.out.println(sum);
        } else {
            new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
            new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).fork();
        }
    }

    public static void main(String[] args) {
        ForkJoinPool fjPool = new ForkJoinPool();
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        fjPool.invoke(new Sum(data, 0, data.length));
        System.out.println("----------");
        fjPool = new ForkJoinPool();
        data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        fjPool.invoke(new Sum(data, 0, data.length));
    }

}
