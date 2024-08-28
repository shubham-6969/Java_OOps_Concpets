        //                          .......DYNAMIC METHOD.......
class Phone{
    public void Message(){
        System.out.println(" hello ");
    }
    public void TurnOn(){
        System.out.println(" Turing On Phone ");
    }
}
class SmartPhone extends Phone{
    public void Calling(){
        System.out.println(" Calling.. ");
    }
    public void TurnOn(){
        System.out.println(" Turning on SmartPhone ");
    }
}
public class Dynamic_Method {
    public static void main(String[] args) {
        Phone obj = new Phone();                // Object is created in runtime.....
        obj.Message();

                 Phone obj2   = new SmartPhone();
// Secnario 1    Super Class  = Sub   Class      Allowed 
                 obj2.TurnOn();

//                 SmartPhone obj2 = new Phone();
// Secnorio 2      Sub   Class     = Super Class    Not Allowed   Throws the error...

    }
    
}
