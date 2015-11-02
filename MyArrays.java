/*
 * Project: MyArrays.java
 * Description: A simple program that converts numbers to chars.
 * Name: Aaron Snowberger
 * Date: Nov 2, 2015
 */

/**
 * Notes:
 * 0. You need 2 FOR LOOPS + 1 ARRAY
 * 1. FOR LOOP 1 = count from 65-90 and add each number to ARRAY 1
 *    char ch[] = {}; ch[0] = 'A' (ch[x] = (char)65;)
 * 2. FOR LOOP 2 = print the 26 Letters with one comma and one space
 */

public class MyArrays {
  
  public static void main( String[] args ) {
    
    char ch[] = new char[26];
    int index = 0;
    
    // FOR LOOP 1
    for( int x=65; x<91; x++ ) {
      //System.out.println( (char) x );
      ch[index] = (char) x;
      index++;
      System.out.println( ch[index-1] );
    }
    
    for( int i=0; i<ch.length-1; i++ ) {
      System.out.print( ch[i] + ", " );
    }
    System.out.println( ch[25] );
    
    // FOR LOOP 2
    //for () {
      
    //}
    
  } // END main method
  
  
  
} // END class
//public class Cat {
//
//}
//public class Dog {
//  private String species = "dog";
//  private int numLegs = 4;
//  boolean tail = true;
//  
//  public Dog() {
//    bark();
//  }
//  public static void bark() {
//    
//  }
//  
//  public wagtail() {
//    boolean ltr = true;
//    System.out.println( "I wag left to right" );
//  }
//  
//  public drinkwater() {}
//  
//  public eatgarbage() {}
//}
//public class Terrier extends Dog {
//  String breed = "terrier";
//  
//  public Terrier() {
//    
//  }
//  
//  public wagtail() {
//    boolean ltr = false;
//    System.out.println( "I wag right to left" );
//  }
//  
//}
//public class myDog extends Terrier extends Cat {
//  String hisname = "Charlie";
//}