package defpackage;

import android.app.Activity;
import defpackage.wj3;
import defpackage.zh3;

/* renamed from: zj3  reason: default package */
public final class zj3 implements wj3.a {
    private final wlf<Activity> a;
    private final wlf<fi3> b;
    private final wlf<gi9> c;
    private final wlf<zh3.a> d;

    public zj3(wlf<Activity> wlf, wlf<fi3> wlf2, wlf<gi9> wlf3, wlf<zh3.a> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public wj3 b(fj3 fj3) {
        Activity activity = this.a.get();
        a(activity, 1);
        Activity activity2 = activity;
        fi3 fi3 = this.b.get();
        a(fi3, 2);
        fi3 fi32 = fi3;
        gi9 gi9 = this.c.get();
        a(gi9, 3);
        gi9 gi92 = gi9;
        zh3.a aVar = this.d.get();
        a(aVar, 4);
        a(fj3, 5);
        return new yj3(activity2, fi32, gi92, aVar, fj3);
    }
}
