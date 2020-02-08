package mastermind;


import java.util.Random;

public class MastermindModel {
  public static final int NUMBER_OF_POSITIONS = 4;
  public static final int MAXIMUM_VALUE = 5;

  private Random rn     = new Random();
  private int[]  answer = new int[NUMBER_OF_POSITIONS];

  public MastermindModel() {
    for (int i=0; i < answer.length; i++)
      answer[i] = rn.nextInt( MAXIMUM_VALUE+1 );
  }

  public void guess( int[] input, int[] bw ) {
    bw[0] = bw[1] = 0;
    for (int i=0; i < answer.length; i++)
      if (input[i] == answer[i])
        bw[0]++;
  }

  public int[] getAnswer() {
    return answer;
}
  
 
  }
