import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  public ArraySequence(int[] other){
    currentIndex = 0;
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
  }

  
}
