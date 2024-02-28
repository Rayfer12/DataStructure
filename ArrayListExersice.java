import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Black");
        colors.add(2, "Orange"); 
        colors.remove(1); 
        
        System.out.println("Updated Colors ArrayList:");
        System.out.println(colors);
        System.out.println(searchColor(colors, "Green"));
        
        
        removeDuplicates(colors);
        System.out.println("Colors ArrayList after removing duplicates:");
        System.out.println(colors);
    }

    
    public static String searchColor(ArrayList<String> colors, String searchTerm) {
        int position = colors.indexOf(searchTerm);
        return position != -1 ? "Color '" + searchTerm + "' Available at position " + position + " in the ArrayList." :
                                "Color '" + searchTerm + "' Not available in the ArrayList.";
    }

    public static void removeDuplicates(ArrayList<String> colors) {
        ArrayList<String> uniqueColors = new ArrayList<>();
        for (String color : colors) {
            if (!uniqueColors.contains(color)) {
                uniqueColors.add(color);
            }
        }
        colors.clear();
        colors.addAll(uniqueColors);
    }
}
