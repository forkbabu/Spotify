package defpackage;

/* renamed from: yxd  reason: default package */
public interface yxd {
    public static final ane a;
    public static final ane b;
    public static final ane c;
    public static final ane d;
    public static final ane e = new ane("consumptionOrder", false, null, 6);

    static {
        ane ane = new ane("publishDate", false, new ane("name", false, null, 6));
        a = ane;
        ane ane2 = new ane("publishDate", true, new ane("name", false, null, 6));
        b = ane2;
        c = new ane("number", false, ane);
        d = new ane("number", true, ane2);
    }
}
