
package sunxsunny.overloding;

/**
 *
 * @RAZAHAN
 */
public class MyClass {
    
//    Method overloading by same function name opssible when number argumenents & data type are different ||
    
    
//    By Changing number of arguments || Like: sum(int a, int b) & sum(int x, int y, int z)
    public void sum(int a, int b){
        
        int c = a+b;
        System.out.println(c);
        
    }
    
    
    public void sum(int x, int y, int z){
        
        int w = x+y+z;
        System.out.println(w);
      
    }
    
//    By changing the data type || Like: sum2(int a, int b) & sum2(double x, double y)
    
    public void sum2(int a, int b){
        
        int c=a+b;
        System.out.println(c);
         
    }
    
    public void sum2(double x, double y){
        
        double z=x+y;
        System.out.println(z);
    
    }
    
}
