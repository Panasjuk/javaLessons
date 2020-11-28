package Exercises;

import Utils.ConfigConstants;

public class Lab_3_1 extends Lab {

    @Override
    public void execute(){
        int[] array = reader.readArray(ConfigConstants.lab_3_1_FilePath);
        int maxValue = findMaxInt(array);
        writer.writeArray(array);

        System.out.println("Max value = " + maxValue);
    }

    private int findMaxInt(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++){
            result = array[i] > result ? array[i] : result;
        }
        return result;
    }
}
