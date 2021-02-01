package ua.com.alevel.fixedProjects.fourthTask;

import java.util.ArrayList;
import java.util.List;

public class Quiz{
    public static void main(String[] args) {
        System.out.println(wildcardsTest(new ArrayList<>()));
    }


    public static int wildcardsTest(List<? super Integer> numbers) {
        numbers.add(10);
        return (int) numbers.get(0);
    }

}
