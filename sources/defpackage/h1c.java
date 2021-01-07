package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: h1c  reason: default package */
public final class h1c {
    private final wlf<t8a> a;
    private final wlf<Context> b;

    public h1c(wlf<t8a> wlf, wlf<Context> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public g1c b(int i, Integer num, boolean z, View view) {
        t8a t8a = this.a.get();
        a(t8a, 1);
        t8a t8a2 = t8a;
        Context context = this.b.get();
        a(context, 2);
        a(view, 6);
        return new g1c(t8a2, context, i, num, z, view);
    }
}
