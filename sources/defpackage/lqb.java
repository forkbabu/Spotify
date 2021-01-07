package defpackage;

import android.content.Context;

/* renamed from: lqb  reason: default package */
public final class lqb {
    private final wlf<Context> a;

    public lqb(wlf<Context> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public kqb b(gqb gqb) {
        Context context = this.a.get();
        a(context, 1);
        a(gqb, 2);
        return new kqb(context, gqb);
    }
}
