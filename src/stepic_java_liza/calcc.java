package stepic_java_liza;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
public class calcc{
    public static void main(String[] args) throws FileNotFoundException {
    File file = new File("C:\\Users\\lizad\\IdeaProjects\\stepic_liza\\src\\stepic_java_liza\\inputt.txt");
    PrintWriter printWriter = new PrintWriter("C:\\Users\\lizad\\IdeaProjects\\stepic_liza\\src\\stepic_java_liza\\output.txt");

    Scanner sc = new Scanner(file);
        try {
            Double x = Double.parseDouble(sc.next());
            String sym = sc.next();
            Double y = Double.parseDouble(sc.next());
            if (sym.equals("+")) {
                printWriter.println(x + y);
                printWriter.close();
            } else if (sym.equals("-")) {
                printWriter.println(x - y);
            } else if (sym.equals("*")) {
                printWriter.println(x * y);
            } else if (sym.equals("/")) {
                if (y == 0) {
                    throw new ArithmeticException();
                } else {
                    printWriter.println(x / y);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
        } catch (UnsupportedOperationException e) {
            System.out.println("Operation Error!");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero");
        }
    }}

