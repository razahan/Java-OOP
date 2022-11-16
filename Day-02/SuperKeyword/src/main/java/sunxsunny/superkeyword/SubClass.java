
package sunxsunny.superkeyword;

/**
 *
 * @RAZAHAN
 */
public class SubClass extends SuperClass {
    
    
    String s="This is from sub-class !";

    
    @Override
    public void printFunction(){
        
//        To print from Super Class

//        1st rule
        System.out.println(super.s);    // Just have to use (super) keyword
        
//        2nd rule        
       // super.printFunction();  // This printFunction call from SuperClass by the keyword of ( super ) to forcefully active superclass.
        
        System.out.println(s);
        
    }
    
}
