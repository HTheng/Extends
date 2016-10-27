package com.d_5_8_overwrite;

/**
 * Created by hengjiang on 16/5/8.
 */
public class Dancer extends actress {
    String BB;


    public void printBB(String _BB){
        System.out.println("操"+ _BB);
    }

    public static void main(String arg[]){
        Dancer dan = new Dancer();
        dan.BB = "BB";
        dan.printBB("tangyan");
    }
}
