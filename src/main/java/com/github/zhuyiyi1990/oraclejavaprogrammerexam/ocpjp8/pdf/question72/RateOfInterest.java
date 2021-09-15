package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocpjp8.pdf.question72;

public class RateOfInterest {

    public static void main(String[] args) {
        int rateOfInterest = 0;
        String accountType = "LOAN";
        switch (accountType) {
            case "RD":
                rateOfInterest = 5;
                break;
            case "FD":
                rateOfInterest = 10;
                break;
            default:
                assert false : "No interest for this account";
        }
        System.out.println("Rate of interest:" + rateOfInterest);
    }

}
