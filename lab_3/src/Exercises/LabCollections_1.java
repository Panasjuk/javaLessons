package Exercises;

import Utils.ConfigConstants;

import java.util.*;

public class LabCollections_1 extends Lab {
    @Override
    public void execute() {
        List<String> inputList = reader.readListOfStrings(ConfigConstants.stringFilePath);

        System.out.println(getUniqueStrings1(inputList));
//        HashSet<String> unique = getUniqueStrings(inputList);
//        TreeSet<String> treeSet = new TreeSet<>(unique);
//        printHashSet(unique);
//        printTreeSet(treeSet);
    }

    private void printHashSet(HashSet<String> unique){
        System.out.println("List of unique strings");
        for (String s:unique) {
            System.out.println(s);
        }
        System.out.println();
    }

    private void printTreeSet(TreeSet<String> treeSet){
        System.out.println("List of unique strings from TreeSet");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    private HashSet<String> getUniqueStrings(List<String> inputList) {
        HashSet<String> unique = new HashSet<>();
        for (String line:inputList) {
            unique.add(line);
        }
        return unique;
    }

    private List<String> getUniqueStrings1(List<String> inputList) {
        List<String> unique = new LinkedList<>();
        for (String line:inputList) {
            if (!unique.contains(line)){
                unique.add(line);
            }
        }
        return unique;
    }
}
