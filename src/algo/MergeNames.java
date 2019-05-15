package algo;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
       Set<String> distinctNames = new HashSet(Arrays.asList(names1));
       distinctNames.addAll(new HashSet(Arrays.asList(names2)));
        return distinctNames.toArray(new String[distinctNames.size()]);
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
