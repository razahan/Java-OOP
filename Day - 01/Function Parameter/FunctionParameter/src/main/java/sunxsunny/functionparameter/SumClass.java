
package sunxsunny.functionparameter;

/**
 *
 * @RAZAHAN
 */
public class SumClass {

//  This is the general system    
    public void addclass(){  
        int a=20;
        int b=30;
        int c=a+b;
        int d=a*b;
        System.out.println(d);
        System.out.println(c);
    }
    
//    This is a parameter function system. We can do change from our main method.
    public void parameterClass(int a, int b){
        
        int c=a+b;
        System.out.println(c);
    }
    
}
