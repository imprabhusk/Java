// Simple Hello World Program in Java

// Valid Ways to Write Hello World Program in Java

// Method - 1 Using String[] args

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// Method - 2 Using String []args

public class Hello {

    public static void main(String []args) {
        System.out.println("Hello World!");
    }
}

// Method - 3 Using String args[]

public class Hello {

    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
}

// Method - 4 Using String... args

public class Hello {

    public static void main(String... args) {
        System.out.println("Hello World!");
    }
}

// Method - 4 By Changing the places of Access Specifier and Access Modifier

public class Hello {

    static public void main(String... args) {
        System.out.println("Hello World!");
    }
}

// Method - 5 Using Final Keyword

public class Hello {

    public static final void main(String... args) {
        System.out.println("Hello World!");
    }
}

// Method - 4 Using Final in first place

public class Hello {

    final public static void main(String... args) {
        System.out.println("Hello World!");
    }
}