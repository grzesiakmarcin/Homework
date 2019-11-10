package Interface.Lambdas;

public class Celebrity {
    private String name;
    private boolean canSing;
    private boolean canAct;
    private boolean canDance;


    public Celebrity (String name, boolean canSing, boolean canAct, boolean canDance) {
        this.name = name;
        this.canSing = canSing;
        this.canAct = canAct;
        this.canDance = canDance;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public boolean CanSing () {
        return canSing;
    }


    public boolean CanAct () {
        return canAct;
    }


    public boolean CanDance () {
        return canDance;
    }


    @Override
    public String toString () {
        return "Nasi Celebryci" +
                "imię:'" + name + '\'' +
                ", umie śpiewać: " + canSing +
                ", umie grać:" + canAct +
                ", umie tańczyć: " + canDance;
    }
}

class CheckCanSinger {
    boolean test (Celebrity celeb) {
        return celeb.CanSing();
    }
}

class CheckCanAct {
    boolean test (Celebrity celeb) {
        return celeb.CanAct();
    }
}


class CheckCanDance {
    boolean test (Celebrity celeb) {
        return celeb.CanDance();
    }
}



