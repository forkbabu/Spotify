package defpackage;

/* renamed from: q52  reason: default package */
public final class q52 {
    private static p52 a;

    public static synchronized p52 a() {
        p52 p52;
        synchronized (q52.class) {
            if (a == null) {
                a = new r52();
            }
            p52 = a;
        }
        return p52;
    }
}
