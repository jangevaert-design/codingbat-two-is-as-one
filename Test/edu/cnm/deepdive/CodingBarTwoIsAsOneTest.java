package edu.cnm.deepdive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBarTwoIsAsOneTest {

  public static int[][] TwoAsOneParams = {
      {1, 2, 3},
      {3, 1, 2},
      {3, 2, 2}
  };

  public static boolean[] TwoAsOneExpected = {true, true, false};

  @Test
  void twoAsOne() {
    CodingBarTwoIsAsOne c = new CodingBarTwoIsAsOne();
    for (int i = 0; i < TwoAsOneParams.length ; i++) {
      boolean actual = CodingBarTwoIsAsOne.twoAsOne(TwoAsOneParams[i][0], TwoAsOneParams[i][1], TwoAsOneParams[i][2]);
      Assertions.assertEquals(TwoAsOneExpected[i], actual );
    }
  }
}