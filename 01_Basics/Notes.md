## Java Scanner ka nextLine() Trap! (And How to Escape It)

```java
// Problem: nextLine() sometimes skips input after nextInt(), nextFloat(), etc.
// Let's decode this mysterious bug like a pro 🕵️‍♀️

import java.util.*;

class ScannerTrap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt(); // Reads 5

        sc.nextLine(); // 🧽 Eats the leftover newline character ('\n')

        System.out.print("Enter a full line: ");
        String s = sc.nextLine(); // Now reads "Hello Java!"

        System.out.println("Integer: " + a);
        System.out.println("String: " + s);
    }
}
```

## Always clean up after methods like:

### nextInt()
### nextFloat()
### nextLong()
### nextByte()

### 📌 **Note:** 1. Add a `sc.nextLine();` right after them before using `nextLine()` to avoid input skipping bugs.
## 2. Scanner is not Thread Safe while BufferReader is.
## 3. Is it possible to call the println() method without any arguments? YES, Reason :- 
## Methods inside the same class can call each other using just methodName() , but to call non-static methods in another class or from a main method, you must first create an object of that class and then call its methods using object. methodName() .

