package LambdaExpression;

public class AboutLambda {
  /**  lambda expression:-

   * Definition:-It is Anonymous function without having name,modifiers and return type.
   * Characteristics/properties of lambda Expression:-1)It can take any number of parameters
                                                                 Ex:-()->System.out.println("hello java 8 new features");
                                                                 Ex:-(s)->s.length();
                                                                 Ex:-(a,b)->System.out.println(a+b);
                                                      2)If multiple parameter are present then  parameters should be represented with ","
                                                                 Ex:-(a,b)->System.out.println(a+b);
                                                      3)If only one parameter available then () are optional.
                                                                 Ex:-(s)->s.length();can be written as
                                                                      s->s.length();
                                                      4)Usually we can specify the type of parameter,if compiler expect the type based on context then we can remove type(type Interface).
                                                                 Ex:-(int a,int b)->System.out.println(a+b);can be written as
                                                                         (a,b)->System.out.println(a+b);
                                                      5)similar to method bodies lambda expression can contain any number of statements.If multiple statements are there then we should enclose within "{}".
                                                                 Ex->()->{System.out.println(a+b);
                                                                          System.out.println(a+b);
                                                                           System.out.println(a+b);};
                                                      6)If body contains only one statement then {} are optional.
                                                                 Ex:-()->System.out.println("hello");
                                                      7)If lambda expression returns something then return keyword is optional
                                                                 Ex:-InterFace value = (a, b) ->{ return a * b;};can be written as
                                                                 InterFace value = (a, b) -> a * b;
                                                      8)We can access both local ang global variables using lambda expression,but after accessing local variable implicitly behave like final variable
                                                                 Ex:-refer class LocalAndGlobalVariablesInLambda
   * Uses:-1)Enables functional programming in java.
           2)Reduces length of code so that readability will be improved.
           3)We can resolve complexity of Anonymous inner classes until some extents.
           4)We can handle procedures/functions just like values.
           5)We can pass procedures/functions as arguments.
           6)Easy to use,update APIs and Libraries.
           7)Enable support for parallel processing.
   *Some Built-in Java Functional Interfaces:-1)Runnable –> This interface only contains the run() method.
                                              2)Comparable –> This interface only contains the compareTo() method.
                                              3)ActionListener –> This interface only contains the actionPerformed() method.
                                              4) Callable –> This interface only contains the call() method.

   */
}
