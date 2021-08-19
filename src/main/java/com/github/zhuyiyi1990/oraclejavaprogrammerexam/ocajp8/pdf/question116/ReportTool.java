package com.github.zhuyiyi1990.oraclejavaprogrammerexam.ocajp8.pdf.question116;

interface Exportable {

    void export();

}

class Tool implements Exportable {

    public void export() {
        System.out.println("Tool::export");
    }

}

public class ReportTool extends Tool implements Exportable {

    public void export() {
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool aTool = new ReportTool();
        Tool bTool = new Tool();
        callExport(aTool);
        callExport(bTool);
    }

    public static void callExport(Exportable ex) {
        ex.export();
    }

}
