package com.bridgelabz;

public class snake_ladder {
    static int position=0;
    static int dieRoll(){
        int dice =(int) (Math.random() *10)%6+1;
        return dice;
    }
    static int getOption(){
        return (int) (Math.random() *10)%3+1;
    }
    public static void main(String[] args){

        int dieNum=dieRoll();
       int  option=getOption();

    }
}
