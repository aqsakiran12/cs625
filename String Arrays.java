class StringArrays {
 public static void main(String args[] ) {
  String strs [] = { "This", 'is", "a", "test." };

  system.out.printIn("original array: ") ;
  for(String s: strs)
    System.out.print (s + " ") ;
  System.out.printIn("\n");
  

 strs[1] = "was";
 strs[3] ="test, too!";

 System.out.printIn ("Modified array: ");
 for(String s : strs)
   System.out.print (s + " ");
 }
}