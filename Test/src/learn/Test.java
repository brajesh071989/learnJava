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
public class Test {
    
    private String name;
    private int age;
    
    public Test(String name, int age){
        setName(name);
        setAge(age);
        
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
       
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    public String toString(){
        return this.name+"'s age : "+this.age;
    }
    
}
