

public class Generics {

  public static <T extends Comparable <T>> T findMax(T a, T b){
    int n = a.compareTo(b); //for a<b, n=-1 //for a=b, n=0 //for a>b, n=1
    if (n<0){
      return b;
    } else {
      return b;
    }
  }

  public static void main (String[] args) {
    System.out.println(findMax(2, 3));
    System.out.println(findMax(3, 3));
    System.out.println(findMax(3, 2));

    //Can be applied to doubles, characters, strings; all which have compareTo() method.
    //Whatever data type we give as input, <T> acts like that data type.
    System.out.println(findMax(2.0, 3.0));
    System.out.println(findMax('a', 'b')); //b is greater than a
    System.out.println(findMax("hello", "there")); //there is greater than hello

    /*For data types that do not have compareTo() method,
    in order to use that method, we need to implement Comparable interface,
    such that-->  public class Generics implements Comparable*/
    
  }
}
