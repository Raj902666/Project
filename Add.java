public class Add {

  int add (int a , int b){
    return a+b;
  }
  public static void main(String[] args) {
    Add s = new Add();
    int sum = s.add(5,88);
    System.out.println("The sum is: "+ sum);
  }
}
