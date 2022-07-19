package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        if(!isValid(start,end)){
            return null;
        }
        return generateTable(start, end);
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start)
                &&isInRange(end)
                &&isStartNotBiggerThanEnd(start,end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {
        String generateTable ="";
        for(int current = start;current<=end;current++){
            generateTable+=generateLine(start,current);
            if(current!=end){
                generateTable+=System.lineSeparator();
            }
        }
        return generateTable;
    }

    public String generateLine(int start, int row) {
        String generateLine ="";
        for(int current = start;current<=row;current++){
            generateLine += generateSingleExpression(current,row);
            if(current!=row){
                generateLine += "  ";
            }
        }
        return generateLine;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return String.format("%d*%d=%d",multiplicand,multiplier,multiplicand*multiplier);
    }
}
