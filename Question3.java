
import java.util.*;

public class Qustion3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        System.out.println("Enter Size of Array :");
        int n = s.nextInt();

        System.out.print("Enter value : ");
        for(int i = 0; i<n; i++)
            arr.add(s.nextInt());
        
        System.out.println("Output : "+ xorsum(arr, n));           
    }
    public static int rec(int i, int x, ArrayList<Integer> arr,int size) {

        if(i == size)
        return x;

        int choice1 = rec(i+1, x^arr.get(i), arr, size);
        int choice2 = rec(i+1, x, arr, size);
        return choice1+choice2;
    }
    public static int xorsum(ArrayList<Integer> arr, int size){
        return rec(0, 0, arr, size);
    }
}