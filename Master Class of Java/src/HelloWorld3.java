public class HelloWorld3 {
    public static void main(String[] args) {
            System.out.println("Bonjour");
        //        here "Bonjour" is string literal
        // String-literal means the words/characters written in double quotes.
            int var=32;
            int var2=546;
            int var3= var+var2;
        //Java Operators perform an operation (hence the word ) on a variable or value and examples of operators are+,-,/and *
            System.out.println(var3);
            // Here var3 is a variable not string literal.
            System.out.println("Variable3 is " + var3);
            //here Strings get concatenated after value replaced with var3 and then prints as in output.
            var3=1000-var3;
            System.out.println("1000 less than the Current variable3 is " + var3);
            int Number=(10 + 5) + (2*10);

            System.out.println(Number);
    }
}
