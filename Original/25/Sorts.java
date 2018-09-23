import java.util.*;

/**
 *  Working class for Sorts. Contains Bubble, MergerSort, QuickSort, and Insertion Sort.
 *
 * @author     Max Nova
 * @created    2/14/2018
 */
public class Sorts
{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  Sorts()
  {
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(int[] list)
  {
    // Output for the user
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  
    steps++; // initialization of outer
    for (int outer = 0; outer < list.length-1; outer++) 
    {
        steps += 3;
        // 1 - boundary check of outer loop;
        // 2 - increment, outer++
        // 3 - initialization of inner loop
        for (int inner = 0; inner < list.length-outer-1; inner++) 
        {
            steps += 3;
            // 1 - boundary check of inner loop // 2 - increment, inner++
            // 3 - if comparison
            if (list[inner] > list[inner+1])
            {
               int temp = list[inner];
               list[inner] = list[inner + 1];
               list[inner + 1] = temp;
               steps += 3;    // swap of list[inner] & list[inner + 1]
            }       
        }
     }
     }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(int[] list)
  {
    
    // Replace these lines with your code
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
      
    int min, temp;
    //Initalization of the 
    steps++;
    for (int outer = 0; outer < list.length - 1; outer++)
    {
        min = outer;
        steps += 4;
        for (int inner = outer + 1; inner < list.length; inner++) 
        {
            steps += 3;
            if (list[inner] < list[min])
            {
                min = inner;  // a new smallest item is found
                steps ++;
            }   
        }
        //swap list[outer] & list[min]
        temp = list[outer];
        list[outer] = list[min];
        list[min] = temp;     
        steps += 3;
    }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(int[] list)
  {
    // Replace these lines with your code
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
    
    steps++;
    for (int outer = 1; outer < list.length; outer++)
    {
        int position = outer;
        int key = list[position];
        steps += 6;
        // Shift larger values to the right
        while (position > 0 && list[position - 1] > key)
        {
             list[position] = list[position - 1];
             position--;
             steps += 4;//4
        }
           list[position] = key;
           steps++;
    }
  }

 /**
   *  Takes in entire vector, but will merge the following sections
   *  together:  Left sublist from a[first]..a[mid], right sublist from
   *  a[mid+1]..a[last].  Precondition:  each sublist is already in
   *  ascending order
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  mid    midpoint index of range of values to be sorted
   * @param  last   last index of range of values to be sorted
   */
  private void merge(int[] a, int first, int mid, int last)
  {
    { 
        //Set the default loop traversal
        int i = first, j = mid + 1;
        int[] temp = new int[last - first + 1];
        //Traverse the length of the c array
        steps++;
        for(int k = first; k <= last; k++)
        {
            //If either of the arrays are empty exit the traversal for that array
            steps+=6;
            //If i value is greater than last
            if(i > mid)
            {
                //Set last j array set to temp
                temp[k - first] = a[j];
                j++;
                steps+=2;
            }
                //If j value is greater than last
                else if(j > last)
                {
                    //Set last i array set to temp
                    temp[k - first] = a[i];
                    i++;
                    steps+=2;
                }
                //If the value in i array is less than j then change
                    else if(a[i] < a[j])
                    {
                        //Set value at i index to temp
                        temp[k - first] = a[i];
                        //increment
                        i++;
                        steps+=2;
                    }
                        ////If the value in i array is greater than j then change
                        else if(a[j] <= a[i])
                        {
                            //Set value at j index to temp
                            temp[k - first] = a[j];
                            //increment
                            j++;
                            steps+=2;
                        }
        }
        
        steps++;
        for(int count = 0; count < temp.length; count++)
        {
            //Copy the temp array into the array the print method uses
            a[first + count] = temp[count];
            steps+=3;
        }
    }
}

  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(int[] a, int first, int last)
  {
    //Define temp and mid vars
    int temp, mid;
    // Recursively divides a list in half, over and over. When the
    // sublist has one or two values, stop subdividing.
    steps+=3;
    //Is there only a single digit?
    if (last - first == 0)
    {
        //Do nothing, a single digit is by nature sorted;
    }
        //If the sublist contains 2 digits
        else if (last - first == 1)
        {
            steps++;
            //Order the list of 2 digits
            if(a[first] > a[last])
            {
                //swoosh, swoosh, swooosh
                temp = a[first];
                a[first] = a[last];
                a[last] = temp;
                steps+=3;
            }
        }
            else
            {
                //mid finds the midpoint of the array
                mid = (first + last) / 2;
                //Recurse through mergeSort
                mergeSort(a, first, mid);
                mergeSort(a, mid + 1, last);
                //Merge the two arrays together
                merge(a, first, mid, last);
                steps+=4;
            }
  }

  /**
   *  Recursive quicksort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void quickSort(int[] list, int first, int last)
  {
    int g = first, h = last;
    int midIndex, dividingValue;
    midIndex = (first + last) / 2;
    dividingValue = list[midIndex];
    do
    {
         steps++;
         while (list[g] < dividingValue)
         {
             g++;
             steps+=2;
         }
         steps++;
         while (list[h] > dividingValue)
         {
             h--;
             steps+=2;
         }
         steps++;
         if (g <= h)
         {
             int temp = list[g];
             list[g] = list[h];
             list[h] = temp;
             g++;
             h--;
             steps+=5;
         }
         steps++;
    }
    while (g < h);
    steps++;
    if (h > first)
    {
        quickSort (list, first, h);
        steps++;
    }
    steps++;
    if (g < last)
    {
        quickSort (list, g, last);
        steps++;
    }
  }

  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount()
  {
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(int stepCount)
  {
    steps = stepCount;
  }
}
