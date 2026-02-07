package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10 );

        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        list.set(2,488);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
