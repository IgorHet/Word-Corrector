package app;

public class Main {

    public static void main(String[] args) {
        Corrector corrector = new Corrector();
        String[] data = new DataProvider().getData();
        String output = corrector.handleData(data);
        getOutput(output);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}