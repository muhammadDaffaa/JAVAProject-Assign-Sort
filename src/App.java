
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    static int choiceNumber;

    static int[] newArrRandomNumber = new int[5];
    static int[][] newArrRandomNumber2D = new int[5][5];

    public static void main(String[] args) {

        while (true) {
            showMenu(); // Call Methode

            System.out.print("Masukan Pilihan Anda ");
            choiceNumber = input.nextInt();

            switch (choiceNumber) {
                case 1:
                    randomNumber();
                    break;
                case 2:
                    bubbleSortASC(newArrRandomNumber);
                    break;
                case 3:
                    selectionSortASC(newArrRandomNumber);
                    break;
                case 4:
                    bubbleSortDESC(newArrRandomNumber);
                    break;
                case 5:
                    selectionSortDESC(newArrRandomNumber);
                    break;
                case 6:
                    return;
                default:
                    break;
            }
        }
    }

    // public static void bubbleSortASC() {
    // }

    public static void randomNumber() {

        System.out.print("Batas Bawah = ");
        int minLimit = input.nextInt();
        System.out.print("Batas Atas = ");
        int maxLimit = input.nextInt();

        for (int i = 0; i < newArrRandomNumber.length; i++) {
            int randomNumber = (int) (minLimit + Math.random() * (maxLimit - minLimit + 1));
            newArrRandomNumber[i] = randomNumber;
            System.out.print(newArrRandomNumber[i] + " ");
        }
        System.out.print("\n");
    }

    static void bubbleSortASC(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) // Looping through the array length
        {
            System.out.println("Pass " + (i + 1));
            printArray(array);
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    printArray(array);
                }
            }
            System.out.println();
            System.out.println("Result Pass " + (i + 1));
            printArray(array);
            System.out.println();
        }
        System.out.print("Result of Pass : ");
        printArray(array);
        System.out.println();
    }

    static void selectionSortASC(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Result of Pass " + (i + 1));
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                    printArray(array);
                }
            }

            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
            System.out.println();
            System.out.println("Result of Pass " + (i + 1));
            printArray(array);
            System.out.println();
        }
        System.out.println("Result ");
        printArray(array);
    }

    static void bubbleSortDESC(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) // Looping through the array length
        {
            System.out.println("Pass " + (i + 1));
            printArray(array);
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    printArray(array);
                }
            }
            System.out.println();
            System.out.println("Result of Pass " + (i + 1));
            printArray(array);
            System.out.println();
        }
        System.out.print("Result of Pass : ");
        printArray(array);
        System.out.println();
    }

    static void selectionSortDESC(int[] array) {

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showMenu() {
        System.out.println("Selamat datang di program simulasi");
        System.out.println("Menu");
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar ");
    }
}
