package edu.cnm.deepdive;

public class StringConcatenation {

  public static void main(String[] args) {
    String text = "hello";
    String anotherText = new String("hello"); //String is a class on its own and doesn't need the
    //new keyword to create a new object.

    System.out.println(2 + 3);//prints 5
    System.out.println("a" + "b");//prints b
    System.out.println(1 + 2 + "a");//prints 3d (if both operands are numeric, arithmetic addition.

    int three = 3;
    String four = "4";
    System.out.println(1 + 2 + three + four);//prints 64 since three is an int.


    int number = 10;
    int anotherNumber = 20;
    System.out.println("result = " + number + anotherNumber);
    //prints: result = 1020 because concatenation goes left to right. So first String plus number
    //gives: result = 10 + anotherNumber. Then String plus anotherNumber gives: result = 1020.
    System.out.println("result = " + (number + anotherNumber));//will give: result = 30.

    String str = "";
    for (int i = 0; i < 10; i++) {
        str += i + " ";
    }
    System.out.println(str);

    String hello = "hello";
    String world = "world";
    String helloWorld = hello + world;

    System.out.println(hello);
  }

}
