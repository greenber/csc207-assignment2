package edu.grinnell.csc207.bresette.assignment2;

public class Rational
{

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  public Rational (int num, int denom)
  {
    // stub
  } //Rational (int, int)

  public Rational (double val)
  {
    // stub
  } //Rational (double)
  public Rational (String val)
  {
    // stub
  } //Rational (string)
  

  // +----------+---------------------------------------------------------
  // | Observers |
  // +-----------+
  public int
    getNumerator ()
  {
    return 0; // stub
  } //getNumerator ()

  public int
    getDenominator ()
  {
    return 0; // stub
  } //getDenominator ()

  public boolean
    isNegative ()
  {
    return true; // stub
  } //isNegative ()

  public boolean
    isPositive ()
  {
    return true; // stub
  } //isPositive()

  public double
    getDoubleValue ()
  {
    return 0.0; // stub
  } //getDoubleValue ()

  public boolean
    isPrime ()
  {
    return true; // stub
  } //isPrime ()

  public int
    compareTo (Rational a)
  {
    return 0; // stub
    // has to extend Comparable
  } //compareTo(Rational)
  
  public boolean
  equals(Rational num)
  {
    return true; //stub
  } //equals(Rational)
  
  // +----------+----------------------------------------------------------
  // | Mutators |
  // +----------+

  public void multiplyBy(int multiplier)
  {
    //stub 
  } //multiplyBy(int)
  
  public void multiplyBy(double multiplier)
  {
    //stub 
  }//multiplyBy(double)
  
  public void multiplyBy(Rational multiplier)
  {
    //stub 
  }//multiplyBy(Rational)
  
  public void addTo(int increaseBy)
  {
    //stub 
  } //addTo(int)
  
  
  public void addTo(double increaseBy)
  {
    //stub 
  }//addTo(double)
  
  public void addTo(Rational increaseBy)
  {
    //stub 
  }//addTo(Rational)
  
  public void setNum(int num)
  {
    //stub
  }//setNum(int)
  public void setDen(int den)
  {
    //stub
  } //setDen(int)
  
  public void subtractBy(int decreaseBy)
  {
    //stub
  } //subtractBy (int)
  
  public void subtractBy(double decreaseBy)
  {
    //stub
  } //subtractBy (double)
  
  public void subtractBy(Rational decreaseBy)
  {
    //stub
  } //subtractBy (Rational)
  
  public void divideBy(int divisor)
  {
    //stub
  } //divideBy (int)
  
  public void divideBy(double divisor)
  {
    //stub
  } //divideBy (double)
  
  public void divideBy(Rational divisor)
  {
    //stub
  } //divideBy (Rational)
  
  public void square()
  {
    //stub
  }
  
  public void expt(int power)
  {
    //stub
  }//expt (int)
  
  public String toString()
  {
    return "";//stub 
  }//toString ()
  
  private void simplify()
  {
	  //stub
  } //simplify ()
  
}
