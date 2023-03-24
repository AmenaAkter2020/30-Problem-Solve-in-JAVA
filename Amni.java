
package ami;
class am{
    int a,b,c;
    am(){
      System.out.println("amena");
    }
    am(int x , int y ){
    a=x; b=y;
    System.out.println(a+b);
}
    am(int x, int y, int z){
        a=x;b=y;c=z;
        
    }
    void disply(){
        System.out.println(a*b*c);
 }

}
public class Amni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          am ob=new am ();
          am ob2=new am (20,20);
          am ob3=new am (2,2,2);
          ob3.disply();
    }
    

}

