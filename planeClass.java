
public class planeClass{
    Boolean first;
    Boolean economy;
    
    public planeClass(){
        first = false;
        economy = false;
    }
    
    public void setFirstClass(){
        first = true;
        economy = false;
    }
    
    public void setEcoClass(){
        first = false;
        economy = true;
    }
    
    public String returnClass(){
        if (first == true && economy == false){
            return "first";
        }
        else if(first == false && economy == true){
            return "economy";
        }
        return "You did it wrong!";
    }
    
    public static void main(String[] args){
        planeClass A = new planeClass();
        System.out.println(A.returnClass());
    }
}