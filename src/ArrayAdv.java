import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Andriy_Yarish on 2/19/2016.
 */
public class ArrayAdv {
    public static void main (String args[]) throws Exception {

        ArrayAdv.initializeArray(getArrSize());
        ArrayAdv.fillArr_OK();
       // ArrayAdv.fillArr_OK2();
        //ArrayAdv.printArr_test();
        ArrayAdv.printArr();
    }

    private static int [][] arr ;
    private static int size;
    public static int getArrSize() throws IOException {
        System.out.println("Write size of array which you would like to draw. Size should be greater than 0");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            size = Integer.parseInt(reader.readLine());
            if (size>0)
                System.out.println("Size accepted");
            else
                System.out.println("Enter valid size ");
        }
        catch (IOException e){
            System.out.println("Enter valid size" + e.getMessage());
        }

        return size;
    }

    public static void initializeArray(int i){
        arr = new int [i][i];
    }

    public static void printArr_test(){
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr.length;j++){
                arr[i][j] = 1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void fillArr_OK(){
        for (int i =0;i<arr.length;i++){
            for (int j =0,k=arr.length;j==k;j++,k--){
                arr[i][j] = 1;
                arr[i][k] = 1;
            }
        }
    }

    public static void printArr(){
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[] arr2  = new int[5];


    public static void fillArr_OK2(){
            for (int j =0,k=arr2.length;j==k;j++,k--){
                arr2[j] = 1;
                arr2[k] = 2;
            }
              for (int i =0;i<arr2.length;i++){
                System.out.print(arr2[i]);
              }
        }
    }

