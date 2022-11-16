
package sunxsunny.instancevariable;

/**
 *
 * @RAZAHAN
 */
public class MyClass {
//    Instance Variables are declared in class but outside of method or function
    public int a=10;
    public int b=12;
    public int c;
    
    public void add(){
        
        this.c=this.a+this.b;
        System.out.println(this.c);
        
        
        
    }
    
}
