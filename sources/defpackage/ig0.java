package defpackage;

/* renamed from: ig0  reason: default package */
public final class ig0 {

    /* renamed from: ig0$a */
    private static class a {
        static final boolean a;

        static {
            boolean z;
            try {
                Class.forName("com.spotify.espresso.EspressoTest");
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            a = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ig0$b */
    public static class b {
        static final boolean a;

        static {
            boolean z;
            try {
                Class.forName("org.robolectric.Robolectric");
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            a = z;
        }
    }

    public static boolean a() {
        return a.a;
    }

    public static boolean b() {
        return b.a;
    }
}
