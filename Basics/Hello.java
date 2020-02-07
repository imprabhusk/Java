// Simple Hello World Program in Java

// Valid Ways to Write Hello World Program in Java

// Method - 1 Using String[] args

// public class Hello {

//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

// Method - 2 Using String []args

// public class Hello {

//     public static void main(String []args) {
//         System.out.println("Hello World!");
//     }
// }

// Method - 3 Using String args[]

// public class Hello {

//     public static void main(String args[]) {
//         System.out.println("Hello World!");
//     }
// }

// Method - 4 Using String... args

// public class Hello {

//     public static void main(String... args) {
//         System.out.println("Hello World!");
//     }
// }

// Method - 5 By Changing the places of Access Specifier and Access Modifier

// public class Hello {

//     static public void main(String... args) {
//         System.out.println("Hello World!");
//     }
// }

// Method - 6 Using Final Keyword in main method

// public class Hello {

//     public static final void main(String... args) {
//         System.out.println("Hello World!");
//     }
// }

// Method - 7 Using Final keyword in first place

// public class Hello {

//     final public static void main(String... args) {
//         System.out.println("Hello World!");
//     }
// }

// Method - 8 Using Strictfp keyword

// public class Hello {

//     final strictfp public static void main(String... args) {
//         System.out.println("Hello World!");
//     }
// }

// Invalid Ways to Write Hello World Program in Java

// Method - 1 (Without using static keyword)

// public class Hello {

//     public void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

// output : 

// This program compiles successfully but produce an error at runtime

// Error: Main method is not static in class Hello, please define the main method as:
//    public static void main(String[] args)

// Method - 2 (Without using public keyword)

// public class Hello {

//     static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

// output :

// This program compiles successfully but produce an error at runtime.
// Error: Main method not found in class Hello, please define the main method as:
//    public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application