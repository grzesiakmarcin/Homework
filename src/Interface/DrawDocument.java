package Interface;

public class DrawDocument implements Interface1 {
    @Override
    public boolean save() {
        return false;
    }

    @Override
    public String open(String path) {
        return null;
    }
}
