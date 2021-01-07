package defpackage;

import android.view.ViewGroup;

/* renamed from: d84  reason: default package */
public final class d84 {
    private final wlf<h84> a;
    private final wlf<o84> b;

    public d84(wlf<h84> wlf, wlf<o84> wlf2) {
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

    public a84 b(ViewGroup viewGroup) {
        h84 h84 = this.a.get();
        a(h84, 1);
        o84 o84 = this.b.get();
        a(o84, 2);
        a(viewGroup, 3);
        return new a84(h84, o84, viewGroup);
    }
}
