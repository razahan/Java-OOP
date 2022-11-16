

package com.sunxsunny.demo;

/**
 *
 * @author User
 */
public class Demo {

    public static void main(String[] args) {
        
        MyFirstClass FirstProgram = new MyFirstClass();     /* At first have to create an Object for calling the function from created class */
        FirstProgram.myfunction();                          /* Then tell object to handle the function */
        FirstProgram.myfunction2();
        
        /*  Second object variable create */
        
        
        MySecondClass SecondProgram = new MySecondClass();       /* Here SecondProgram = Object Variable*/
        SecondProgram.SecondFunction();
        
    }
}
