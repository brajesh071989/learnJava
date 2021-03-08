/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author BrajeshKumar
 */
public class Item {
    private int c;
    public Item (int a, int b){
        int c=a+b;
        this.c=c;
        getSum();
    }
    
    public int getSum(){
        return c;
    }
    
}
