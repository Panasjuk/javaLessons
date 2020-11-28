package Exercises;

import Utils.ConfigConstants;

import java.util.LinkedList;
import java.util.Scanner;

public class Lab_3_3 extends Lab{

    @Override
    public void execute() {
        LinkedList<Integer> list = reader.readList(ConfigConstants.lab_3_3_FilePath);

        System.out.println("Please, enter number to insert:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int size = list.size();

        for (int i = 0; i < list.size(); i ++){
            if (list.get(i) > number){
                if (i == 0){
                    list.addFirst(number);
                }else {
                    list.add(i, number);
                }
                break;
            }
        }
        if (size == list.size()){
            list.addLast(number);
        }

        writer.writeList(list);
    }
}