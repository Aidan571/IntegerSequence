import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end){
    if(end < start){
      throw new IllegalArgumentException("end can't be bigger than start.");
    }
    else
    this.start = start;
    this.end = end;
    this.current = start;
  }

  public void reset(){
    this.current = this.start;
  }

  public int length(){
    return (Math.abs(this.end - this.start) + 1);
  }

  public boolean hasNext(){
    if(current <= this.end){
      return true;
    }
    else
    return false;
  }

  public int next() throws NoSuchElementException{
    if(this.hasNext()){
      int holder = this.current;
      current += 1;
      return holder;
    }
    else
    throw new NoSuchElementException("There is no next value.");
  }
}
