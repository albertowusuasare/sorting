package taojava.labs.sorting;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

/**
 * Performs experiments of the various merge sort algorithms
 * @author albertowusu-asare
 *
 */
public class ExperimentalClass
{
  
  /**
   * Builds a random array
   * @param length the length of the array to build
   */
  
  public static Integer[] arrayBuilder(int length){
    Integer[] vals = new Integer[length];
    Random random = new Random();
    for (int i = 0; i < length; i++)
      vals[i] = random.nextInt(length);
    return vals;
  }// arrayBuilder(int)
  
  // main method for testing

  public static void main(String[] args)
  {
    
    PrintWriter pen = new PrintWriter(System.out, true);
     //Testing merge sorter
    MergeSorter<Integer> sorter =new MergeSorter<Integer>();
    
   // create a randomArray
    Integer [] randomArray = ExperimentalClass.arrayBuilder(5);
    pen.println(Arrays.toString(randomArray));
    StandardIntegerComparator order = StandardIntegerComparator.COMPARATOR;
    sorter.sort(randomArray, order);
    pen.println(Arrays.toString(sorter.sort(randomArray, order)));
    
    
  }// main
}//ExperimentalClass()
