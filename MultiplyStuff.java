package Chapter3;

public class MultiplyStuff
{
    int numToMult;
    public static void main ()
    {
        int numToMult=1;
        for(int i=1;i<13;i++){
            
            for(int j=1; j<13;j++){
                System.out.print(numToMult*j);
                System.out.print("  ");
            }
            System.out.println("  ");
            numToMult++; 
            
        }
        
    }
}
