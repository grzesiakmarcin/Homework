package inheritance;

public class MainClass {
    public static void main(String[] args) {
        int z = 20;
//        OuternClass oC=new OuternClass();
//        InnerClass iC = new InnerClass();
//
////        System.out.println(z + iC.getX()+oC.getY());

        OuternClass checkThisOut = new OuternClass();
        OuternClass.InnerClass foo = checkThisOut.new InnerClass();   // tworzymy zmienna referencyjna typu  OutClass.InnerClass i tworzymy nowyObiekt.
        System.out.println(checkThisOut.getY() + z+ foo.getX());

    }


}


class OuternClass {

    private int y = 41;

    public int getY() {
        return y;
    }




    class InnerClass {

        private int x = 11;

        public int getX() {
            return x;
        }
    }
}



