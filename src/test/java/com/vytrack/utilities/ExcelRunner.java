package com.vytrack.utilities;

public class ExcelRunner {
    public static void main(String[] args) {

        //ENTER YOUR EXCEL FILE'S PATH AND SHEET NAME BELOW FOR GETTING CUCUMBER ROW INDEX
        String excelFilePath="src\\test\\resources\\Vytracktestdata.xlsx";
        String excelFileSheet="QA1-short";
        int columnNumber;

        ExcelUtil excelUtil=new ExcelUtil(excelFilePath, excelFileSheet);
        excelUtil.printCucumberRowIndex();
    }
}
