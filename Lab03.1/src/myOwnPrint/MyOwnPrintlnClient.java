package myOwnPrint;

public class MyOwnPrintlnClient {
    public static void main(String[] args) {
        MyOwnPrintln myOwnPrintln = new MyOwnPrintln();
        myOwnPrintln.myOwnPrintln("This is the string method");
        myOwnPrintln.myOwnPrintln(7 );
        myOwnPrintln.myOwnPrintln(2.3);
        System.out.println(myOwnPrintln.toString());

    }
}
