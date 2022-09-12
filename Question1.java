
import java.util.*;

public class Question1 {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

            ArrayList<Integer> arr = new ArrayList<Integer>();
            ArrayList<Integer> leader = new ArrayList<Integer>();

            System.out.println("Enter Size of Array :");
            int n = s.nextInt();

            for(int i = 0; i<n; i++)
                arr.add(s.nextInt());

            int max = arr.get(n-1);
            leader.add(max);

             for(int i = n-2 ; i>=0; --i){

                if(arr.get(i) > max){
                    max = arr.get(i);
                   leader.add(max);
                }
            }
            Collections.reversesort(leader);
            System.out.print(leader);

            
            
     }
}