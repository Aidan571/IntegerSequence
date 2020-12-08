import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    currentIndex = 0;
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
  }

  public void reset(){
    this.currentIndex = 0;
  }

  public int length(){
    return this.data.length;
  }

  public boolean hasNext(){
    if(currentIndex < this.length()){
      return true;
    }
    else
    return false;
  }

  public int next() throws NoSuchElementException{
    if(this.hasNext()){
      int holder = this.data[currentIndex];
      currentIndex += 1;
      return holder;
    }
    else
    throw new NoSuchElementException("There is no next value.");
  }
}
