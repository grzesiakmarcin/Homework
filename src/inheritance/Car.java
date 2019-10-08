package inheritance;

public class Car extends Machine{

    @Override
    public void start(String jakiObiekt) {
        super.start(jakiObiekt);

        System.out.println(jakiObiekt = " yyyy yyyy yyyyy yyy yyy yyyyy yy y yy y y y tratat");
    }

    @Override
    public void stop(String jakiObiekt) {
        super.stop(jakiObiekt);
    }
}
