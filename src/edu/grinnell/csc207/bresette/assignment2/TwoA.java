package edu.grinnell.csc207.bresette.assignment2;


public class TwoA
{
  public static void
    main (String[] args)
  {
    System.out.println (TwoA.isMultiple (56, 56));
    System.out.println (TwoA.isOdd (5));
    System.out.println (TwoA.oddSumTo (7));
    int[] values = { 1, 3, 4, 5 };
    System.out.println (TwoA.isOddProduct (values));
    System.out.println (TwoA.isDistinct (values));
    TwoA.reverseInts (values);
    for (int i = 0; i < values.length; i++)
      {
        System.out.print (" " + values[i]);
      }

  }

  public static boolean
    isMultiple (long a, long b)
  {
    return ((a % b) == 0);

  } // isMultiple

  public static boolean
    isOdd (int i)
  {

    return (i & 1) == 1;

  } // isOdd

  public static int
    oddSumTo (int n)
  {
    return ((n / 2) * (n / 2));
  }

  public static boolean
    isOddProduct (int[] ints)
  {
    int counter = 0;
    int arrayLength = ints.length - 1;
    int odd = 0;

    while (counter <= arrayLength)
      {
        if (TwoA.isOdd (ints[counter]) == true)
          {
            odd += 1;
            if (odd == 2)
              {
                return true;
              }
          }
        counter++;
      }
    return false;
  }// isOddProduct

  public static boolean
    isDistinct (int[] ints)
  {
    for (int i = 0; i < ints.length; i++)
      {
        for (int j = i + 1; j < ints.length; j++)
          {
            if (ints[j] == ints[i])
              {
                return false;
              }
          }
      }
    return true;
  } // isDistinct

  public static int[]
    reverseInts (int[] ints)
  {
    int length = ints.length;

    for (int i = 0; i < (int) (length / 2); i++)
      {
        int temp = ints[i];
        ints[i] = ints[(length - 1) - i];
        ints[(length - 1) - i] = temp;
      }

    return ints;
  }// reverseInts
}
