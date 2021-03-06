package pl.setblack.badlam;

public class Basic {

    public static Lambda identity(Lambda x) {
        return x;
    }

    public static final Lambda applyIdentity = (y)->y.apply(Basic::identity);

    public static final Lambda AUTOCALL = (x)->x.apply(x);
}
