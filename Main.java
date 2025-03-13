import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    double[] arr = {1.1, 2.2, 3.3};
    System.out.println(sumArray(arr));
    String[] array2 = {"Nyan", "Poptart", "Cat"};
    System.out.println(averageLength(array2));
    int[] array3 = {1, 2, 3, 4, 5};
    System.out.println(arrayMax(array3));
    String[] array4 = {"Chocolate", "Ice", "Cream"};
    System.out.println(linearSearch(array4, "Cream"));
    // TODO: Make an array of Strings as well as a target, and test your linearSearch method
  }


  public static double sumArray(double[] arr)
  {
    double sum = 0.0;
    for(double x : arr) {
       sum += x;
    }
    return sum;
  }

  public static double averageLength(String[] arr)
  {
    double len = 0.0;
    for(int i = 0; i < arr.length; i++) {
      int elementLen = arr[i].length();
      len += elementLen;
    }
    return (double) len / arr.length;
  }

  public static int arrayMax(int[] arr)
  {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
          max = arr[i];
        }
    }
    return max;

  }

  public static boolean linearSearch(String[] arr, String target)
  {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i].equals(target)) {
        return true;
      }
    }
    return false;
  }
}
