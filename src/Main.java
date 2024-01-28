import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] arrOne = new int[3];
        arrOne[0] = 1;
        arrOne[1] = 2;
        arrOne[2] = 3;
        System.out.println(arrOne[0]);
        System.out.println(arrOne[1]);
        System.out.println(arrOne[2]);

        System.out.println();

        double[] arrTwo = {1.57, 7.654, 9.986};
        System.out.println(arrTwo[0]);
        System.out.println(arrTwo[1]);
        System.out.println(arrTwo[2]);



        System.out.println();

        int[] arrThree = {15, 16, 17, 18};
        for (int i = 0; i < arrThree.length; i++) {
            System.out.println(arrThree[i]);
        }

        System.out.println();

        System.out.println("Задача №2");

        for (int i = 0; i < arrOne.length; i++) {
            System.out.print(arrOne[i]);
            if (i != arrOne.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача №3");

        for (int i = arrOne.length -1; i >= 0; i--){
            System.out.print(arrOne[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = arrTwo.length -1; i >= 0; i--){
            System.out.print(arrTwo[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrThree.length -1; i >= 0; i--){
            System.out.print(arrThree[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задача №4");
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 != 0) {
                arrOne[i]++;
            }
        }
        System.out.println(Arrays.toString(arrOne));


    }
}