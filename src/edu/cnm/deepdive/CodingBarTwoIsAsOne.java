package edu.cnm.deepdive;

/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */

public class CodingBarTwoIsAsOne {

  public static void main(String[] args) {
    System.out.printf("With the numbers %d, %d and %d the outcome will be " + twoAsOne(1, 2, 3) + ".\n", 1, 2, 3);
    System.out.printf("With the numbers %d, %d and %d the outcome will be " + twoAsOne(3, 1, 2) + ".\n", 3, 1, 2);
    System.out.printf("With the numbers %d, %d and %d the outcome will be " + twoAsOne(3, 2, 2) + ".\n", 3, 2, 2);

  }

  public static boolean twoAsOne(int a, int b, int c) {
    return ((a+ b) == c || (a + c) == b || (b + c) == a);
  }

}
