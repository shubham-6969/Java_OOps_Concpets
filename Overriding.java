class Bank{
    int getRateOFInterest(){
        return 0;
    }

}
class SBI extends Bank{
    int getRateOFInterest(){
        return 8;
    }
}
class ICICI extends Bank{
    int getRateOFInterest(){
        return 7;
    }
}
class Axis extends Bank{
    int getRateOFInterest(){
        return 9;
    }
}
public class Overriding {
 public static void main(String[] args) {
    SBI s = new SBI();
    ICICI i = new ICICI();
    Axis a = new Axis();

    System.out.println(" Rate of Interesrt: " + s.getRateOFInterest() + " %");
    System.out.println(" Rate of Interesrt: " + i.getRateOFInterest()+ " %");
    System.out.println(" Rate of Interesrt: " + a.getRateOFInterest() + " %");
  
 }    

}
