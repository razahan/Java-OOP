
package sunxsunny.inheritance;

//  To create SubClass of a SuperClas, we have to add "extends SuperClass name" 
public class ChildClass extends FatherClass {
    
    public void sumFunction(){
        
//        SubClass overwrite the method here
        this.c= this.a*this.b;
        System.out.println(this.c);
    }
    
}
