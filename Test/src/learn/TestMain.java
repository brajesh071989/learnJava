/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author brajeshkumar
 */
public class TestMain {
    
    public static void main (String [] args){
        Test tst=new Test("Neeraj KUmar",27);
        
        System.out.println("Name of user is : "+tst.getName());
        System.out.println("Age of the user is : "+tst.getAge());
        System.out.println(tst);
        
    }
    
}
