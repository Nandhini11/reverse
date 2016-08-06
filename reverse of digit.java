
package sumofnumbers;
public class sumofsum {
    public static void main(String[] args){
        System.out.println("enter the no to be reversed");
        Scanner sc=new Scanner(System.in);
         int i1=sc.nextInt();
        int r=0,d=0,d1=0,sum=0,y=0;
         int i1=123;
        while(i1>0){
          d=i1%10;
          r=r*10+d;
          i1=i1/10;
        }
   
        System.out.println(r);
    
}

}