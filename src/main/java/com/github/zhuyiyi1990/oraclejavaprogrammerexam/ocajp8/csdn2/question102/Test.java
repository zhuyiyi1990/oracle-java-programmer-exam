package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.csdn2.question102;

class Alpha {

    public String[] main = new String[2];

    Alpha(String[] main) {
        for (int ii = 0; ii < main.length; ii++) {
            this.main[ii] = main[ii] + 5;
        }
    }

    public void main() {
        System.out.print(main[0] + main[1]);
    }
}

public class Test {

    public static void main(String[] args) {
        Alpha main = new Alpha(args);
        main.main();
    }

}
