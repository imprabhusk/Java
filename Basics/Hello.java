// Simple Hello World Program in Java
// Keywords and its Meaning are given in the end of this page.

// Valid Ways to Write Hello World Program in Java

// Method - 1 Using String[] args

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 2 Using String []args

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 3 Using String args[]

public class Hello {

    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 4 Using String... args

public class Hello {

    public static void main(String... args) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 5 By Changing the places of Access Specifier and Access Modifier

public class Hello {

    static public void main(String... args) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 6 Using Final Keyword in main method

public class Hello {

    public static final void main(String... args) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 7 Using Final keyword in first place

public class Hello {

    final public static void main(String... args) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 8 Using Strictfp keyword

public class Hello {

    final strictfp public static void main(String... args) {
        System.out.println("Hello World!");
    }
}

// output : Hello World!

// Method - 9 (Using Command Line Arguements)

public class Hello {

    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);
    }
}

// output :

// javac Hello.java
// java Hello "Hello" "World!"

// Hello World!

// Invalid Ways to Write Hello World Program in Java

// Method - 1 (Without using static keyword)

public class Hello {

    public void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// output :

// This program compiles successfully but produce an error at runtime

// Error: Main method is not static in class Hello, please define the main
// method as:
// public static void main(String[] args)

// Method - 2 (Without using public keyword)

public class Hello {

    static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// output :

// This program compiles successfully but produce an error at runtime.

// Error: Main method not found in class Hello, please define the main method
// as:
// public static void main(String[] args)
// or a JavaFX application class must extend javafx.application.Application

// Method - 3 (Interchanging the Access Modifier(static) and Datatype or
// returntype(void))

public class Hello {

    public void static main(String[] args) {
        System.out.println("Hello World!");
    }
}

// output :

// error: <identifier> expected
// public void static main(String[] args) {
// error: '(' expected
// public void static main(String[] args) {
// error: invalid method declaration; return type required
// public void static main(String[] args) {

// Method - 4 (using abstract keyword)

public class Hello {

    abstract public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// output :

// error: illegal combination of modifiers: abstract and static
// abstract public static void main(String[] args) {
// error: Hello is not abstract and does not override abstract method
// main(String[]) in Hello
// public class Hello

// Keywords and its Meaning :

// 1.class
// class keyword is used to declare a class
// class is a Blueprint or Model or Template for creating an Object

// 2.public
// It is an Access Specifier
// It represents Visibility
// Main method is visible to all classes

// 3.static
// It is an Access Modifier
// If main method is declared static ,which means
// main method is common for the entire program