package defpackage;

/* renamed from: eg  reason: default package */
public class eg {
    private static eg a;

    private eg() {
    }

    public static synchronized eg a() {
        eg egVar;
        synchronized (eg.class) {
            if (a == null) {
                a = new eg();
            }
            egVar = a;
        }
        return egVar;
    }
}
