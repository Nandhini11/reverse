
package sumofnumbers;


public class sumofsum {
    public static void main(String[] args){
        
        int r=0,d=0,d1=0,sum=0,y=0;
         int i1=123;
        while(i1>0){
          d=i1%10;
          r=r*10;
          i1=i1/10;
        }
    while(r>0){
        d1=r%10;
        sum=sum+d1;
        y=y+sum;
        r=r/10;
    }
        System.out.println(y);
    
}

}