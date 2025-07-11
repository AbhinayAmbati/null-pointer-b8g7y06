
class SubClass{

    private int n;
    private String s;

    public String getS(){
        return s;
    }

    public int getN(){
        return n;
    }

    public void setN(int n){
        this.n = n;
    }

    public void setS(String s){
        this.s = s;
    }

    public void printSettersValue(){
        System.out.println("Value of n is : " + n + "\n" + "Value of s is : " + s);
    }

} 


public class SetNumAndGetNum {

    public static void main(String[] args) {
        
        SubClass s = new SubClass();

        s.setN(1);
        s.setS("LCJPCXK");
        s.printSettersValue();
        
    }
    
}
