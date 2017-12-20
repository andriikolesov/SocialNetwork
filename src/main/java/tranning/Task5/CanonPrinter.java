package tranning.Task5;

/**
 * @author Igor Hnes on 20.12.17.
 */
public class CanonPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("Canon printer printed: " + text);
    }
}
