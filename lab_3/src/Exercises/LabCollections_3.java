package Exercises;

import Utils.ConfigConstants;

import java.util.*;

public class LabCollections_3 extends Lab{
    @Override
    public void execute() {
        List<String> inputList = reader.readListOfStrings(ConfigConstants.stringFilePath);
        HashMap<Integer, String> map = createMap(inputList);

        printKeySet(map.keySet());
        printValues(map.values());
        printEntrySet(map.entrySet());

        System.out.println("Trying to get value from HashMap for non-existing key: " + map.get(-666));
    }

    private void printEntrySet(Set<Map.Entry<Integer, String>> entries) {
        System.out.println("EntrySet:");
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value = " + entry.getValue());
        }
    }

    private void printValues(Collection<String> values) {
        System.out.println("Values:");
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private void printKeySet(Set<Integer> keySet) {
        System.out.println("KeySet:");
        Iterator<Integer> iterator = keySet.iterator();
        for (int i = 0; i < keySet.size(); i++){
            System.out.println(iterator.next());
        }
    }

    private HashMap<Integer, String> createMap(List<String> inputList){
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < inputList.size(); i++) {
            map.put(i, inputList.get(i));
        }
        return map;
    }
}
