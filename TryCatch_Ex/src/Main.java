import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random rd = new Random();
        int tryCatchArr[] = new int[10];
        for (int i = 0; i < tryCatchArr.length; i++) {
            tryCatchArr[i] = rd.nextInt(tryCatchArr.length);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index number ");
        try {
            int iIndex = sc.nextInt();
            userIndexVal(iIndex, tryCatchArr);
        } catch (InputMismatchException inputMismatchException) {    // When these methods encounter an input that does not match the expected type
            System.out.println("Incorrect entry !!");
        }
    }

    public static void userIndexVal(int iNum, int[] arr) {

        if (iNum < 0 || iNum > arr.length - 1)
            throw new ArrayIndexOutOfBoundsException("Index overflow !!");  // An operation in an invalid index range
        else {
            for (int i : arr) {
                if (i == iNum)
                    System.out.print("arr[" + iNum + "] = " + arr[iNum]);
            }
        }
    }
}
