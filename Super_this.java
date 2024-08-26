class A{
 int a = 10;
   public A(){
    System.out.println(" hello! A ");
   }
}

class B extends A{
  int a = 15;
  void show(int c){
    System.out.println(c);
    //System.out.println(this.a);            // this keyword refers  to the current class  ( class B )
   // System.out.println(super.a);           //  Super keyword refers to the super class ( Parent class )
  }
  public B(){
    System.out.println(" hello! B");
  }
   
}
public class Super_this {
 public static void main(String[] args) {
      B ob = new B();
      ob.show(45);
 }    
}
