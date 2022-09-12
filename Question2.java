
import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> price = new ArrayList<Integer>();
        
        System.out.println("Enter Size of Array :");
        int n = s.nextInt();

        System.out.print("Enter prices : ");
        for(int i = 0; i<n; i++){
            price.add(s.nextInt());
            
        }

       System.out.print("Output: "+ maximum_profit(price,n)); 


    }

    public static int maximum_profit(ArrayList<Integer> price, int size) {

        int min = Collections.min(price);
        int index = price.indexOf(Collections.min(price));
    
        if (index == size-1){
            return 0;
        }

        else{

            for(int i = 0; i<index; i++)
            price.remove(i);

            int max = Collections.max(price);
            int max_profit = max-min;
            return max_profit;
        }
        
    }
}