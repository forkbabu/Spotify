package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: kvb  reason: default package */
public final class kvb {
    private final wlf<LayoutInflater> a;
    private final wlf<Integer> b;

    public kvb(wlf<LayoutInflater> wlf, wlf<Integer> wlf2) {
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

    public jvb b(ViewGroup viewGroup) {
        LayoutInflater layoutInflater = this.a.get();
        a(layoutInflater, 1);
        Integer num = this.b.get();
        a(num, 2);
        int intValue = num.intValue();
        a(viewGroup, 3);
        return new jvb(layoutInflater, intValue, viewGroup);
    }
}
