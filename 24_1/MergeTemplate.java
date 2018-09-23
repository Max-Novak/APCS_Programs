import chn.util.*;
import apcslib.*;
import java.util.*;

/**
 *  Mergesort class to organize a single list
 *
 * @author     G. Peck
 * @created    July 18, 2002
 */
class Sorts
{
  /**
   *  Sorts using the selection sort algorithm
   *
   * @param  list  list is an int array
   */
  public static void selectionSort(int[] list)
  {
    int min, temp;

    for (int outer = 0; outer < list.length - 1; outer++)
    {
      min = outer;
      for (int inner = outer + 1; inner < list.length; inner++)
      {
        if (list[inner] < list[min])
        {
          min = inner;
        }
      }
      //swap(list[outer], list[flag]);
      temp = list[outer];
      list[outer] = list[min];
      list[min] = temp;
    }
  }
}

/**
 *  Sorts two different arrays into one combined.
 * 
 * @created    2/8/2018
 */
public class MergeTemplate
{
  public void merge (int[] a, int[] b, int[] c)
  {
    // Replace these lines with your code
    System.out.println();
    System.out.println("merge method");
    System.out.println();
    
    //Set the default loop traversal
    int i = 0, j = 0;
    int incremA = 0, incremB = 0;
    
    //Traverse the length of the c array
    for(int k = 0; k < c.length; k++)
    {
        //If either of the arrays are empty exit the traversal for that array
        if(a.length == i)
        {
            c[k] = b[j];
            j++;
        }
        else if(b.length == j)
            {
                c[k] = a[i];
                i++;
            }
            //If the value in a index is less than b then set that value into c
            else if(a[i] < b[j])
                {
                    c[k] = a[i];
                    //increment
                    i++;
                }
                ////If the value in a index is less than b then set that value into c
                else if(b[j] <= a[i])
                {
                    c[k] = b[j];
                    //increment
                    j++;
                }
    }
  }

  /**
   *  Initializes an returns temp with random integers in the range
   *  1..largestInt
   *
   * @return  an array of size specified by the user filled
   *          with random numbers
   */
  public int[] fillArray()
  {
    ConsoleIO console = new ConsoleIO();

    System.out.println();
    System.out.print("How many numbers do you wish to generate? ");
    int numInts = console.readInt();

    int[] temp = new int[numInts];

    System.out.print("Largest integer to generate? ");
    int largestInt = console.readInt();

    Random randGen = new Random();

    for (int loop = 0; loop < temp.length; loop++)
    {
      temp[loop] = randGen.nextInt(largestInt) + 1;
    }

    return temp;
  }

  /**
   *  prints out the contents of the array in tabular form, 20 columns
   */
  private void screenOutput(int[] temp)
  {
    for (int loop = 0; loop < temp.length; loop++)
    {
      if (loop % 15 == 0)
      {
        System.out.println();
      }
      System.out.print(Format.right(temp[loop], 5));
    }
    System.out.println();
  }

  /**
   *  Sorting Template:
   *  Provides a main method for access to the sorting menu
   *
   * @param  args  The command line arguments - not used
   */
  public static void main(String[] args)
  {
    MergeTemplate testMerge = new MergeTemplate();

    System.out.println("Filling list a");
    int[] a = testMerge.fillArray();
    System.out.println();
    System.out.println("Filling list b");
    int[] b = testMerge.fillArray();

    int[] c = new int[a.length + b.length];

    Sorts.selectionSort(a);
    Sorts.selectionSort(b);
    testMerge.merge(a,b,c);

    System.out.println();
    System.out.println("list a:  ");;
    testMerge.screenOutput(a);
    System.out.println();
    System.out.println();
    System.out.println("list b:  ");;
    testMerge.screenOutput(b);
    System.out.println();
    System.out.println();
    System.out.println("list c:  ");;
    testMerge.screenOutput(c);
    System.out.println();
  }
}
