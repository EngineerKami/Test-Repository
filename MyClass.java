public class MyClass {
  public static void main(String[] args) {
  try {
    doSomethingWhichThrowsException();
    System.out.println("OK");   // incorrect "OK" message is printed
  } catch (RuntimeException e) {
    System.out.println("ERROR");  // this message is not shown
  }
}

public void switchCall(int param) {
switch(param){
case 0:
doSomething();
break;
}
}

public void testMethod() {
System.out.println("In test method");
}

@Override
  public void finalize() {
    /* ... */
  }

  public Boolean isUsable() {
  // ...
  return null;  
}

public static void doSomethingWhichThrowsException() {
  try {
    throw new RuntimeException();
  } finally {
    for (int i = 0; i < 10; i ++) {
      //...
      if (q == i) {
        break; // ignored
      }
    }

    /* ... */
    return;      // Noncompliant - prevents the RuntimeException from being propagated
  }
}
}
