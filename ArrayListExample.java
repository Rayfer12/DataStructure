import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();

    
        numbers.add(12);
        numbers.add(25);
        numbers.add(34);
        numbers.add(46);

      
        System.out.println("Initial ArrayList: " + numbers);

        
        numbers.remove(Integer.valueOf(25));

       
        System.out.println("Final ArrayList: " + numbers);
    }
}
