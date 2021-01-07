package defpackage;

/* renamed from: lba  reason: default package */
public final class lba {
    private static final u1<String> a;

    static {
        u1<String> u1Var = new u1<>(10);
        a = u1Var;
        u1Var.n(1, "disconnected");
        u1Var.n(3, "connecting");
        u1Var.n(2, "connecting");
        u1Var.n(5, "connected");
        u1Var.n(4, "connected");
    }

    public static String a(int i) {
        String g = a.g(i, null);
        if (g != null) {
            return g;
        }
        throw new IllegalArgumentException(String.format("%s is an invalid state", Integer.valueOf(i)));
    }
}
