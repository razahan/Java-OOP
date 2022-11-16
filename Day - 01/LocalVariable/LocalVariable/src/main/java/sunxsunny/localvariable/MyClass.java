
package sunxsunny.localvariable;

/**
 *
 * @RAZAHAN
 */
public class MyClass {
    
//    This is how we convert from Local Variable to Instanc Variable
    public int first;
    public int second;
    
    public void sumfunction(){
//        Local variable declier inside of function or method
        int a=10;
        this.first=a;
        int b=20;
        this.second=b;
        int c=a+b;
//        c=a+b;
        System.out.println(c);
        
    }
    
}
