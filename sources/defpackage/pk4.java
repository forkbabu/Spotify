package defpackage;

import android.view.ViewGroup;

/* renamed from: pk4  reason: default package */
public final class pk4 {
    private final wlf<tk4> a;

    public pk4(wlf<tk4> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public mk4 b(ViewGroup viewGroup) {
        tk4 tk4 = this.a.get();
        a(tk4, 1);
        a(viewGroup, 2);
        return new mk4(tk4, viewGroup);
    }
}
