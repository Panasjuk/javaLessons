package Exercises;

import Utils.ConfigConstants;

import java.util.HashMap;
import java.util.List;

public class LabCollections_2 extends Lab {
    @Override
    public void execute() {
        List<String> inputList = reader.readListOfStrings(ConfigConstants.stringFilePath);
        HashMap<String, Integer> map = calculate(inputList);
        System.out.println("Repeatability counts:");
        System.out.println(map);
    }

    private HashMap<String, Integer> calculate(List<String> inputList){
        HashMap<String, Integer> map = new HashMap<>();
        for (String line:inputList) {
            if (map.containsKey(line)){
                map.replace(line, map.get(line) + 1);
            }else {
                map.put(line, 1);
            }
        }
        return map;
    }
}