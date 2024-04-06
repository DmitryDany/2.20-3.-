import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int counter=2;
        Map<Integer, Integer>result = new HashMap<>();
        int [] array = new int[20];
        for (int i = 0; i < array.length-1; i++) {
            int value = random.nextInt(1,15);
            array[i] = value;
        }
        System.out.print("Вывод: " + Arrays.toString(array));
        System.out.println();
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j< array.length; j++){
                if (array[i]==array[j]){
                    if (result.containsKey(array[i])){
                        result.put(array[i],counter++);
                    } else {
                        counter=2;
                        result.put(array[i],counter);
                    }
                }
            }
        }
        result.forEach(((integer, integer2) -> System.out.println("Число '" + integer + "' встречается " + integer2 + " раза.")));
    }
}