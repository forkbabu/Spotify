package defpackage;

import android.content.Context;

/* renamed from: yk7  reason: default package */
public final class yk7 {
    private final wlf<vo7> a;
    private final wlf<Context> b;
    private final wlf<il7> c;

    public yk7(wlf<vo7> wlf, wlf<Context> wlf2, wlf<il7> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public xk7 b(String str) {
        a(str, 1);
        vo7 vo7 = this.a.get();
        a(vo7, 2);
        Context context = this.b.get();
        a(context, 3);
        il7 il7 = this.c.get();
        a(il7, 4);
        return new xk7(str, vo7, context, il7);
    }
}
