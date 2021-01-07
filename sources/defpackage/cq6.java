package defpackage;

import android.app.Activity;

/* renamed from: cq6  reason: default package */
public final class cq6 {
    private final wlf<Activity> a;
    private final wlf<jq6> b;
    private final wlf<kq6> c;

    public cq6(wlf<Activity> wlf, wlf<jq6> wlf2, wlf<kq6> wlf3) {
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

    public bq6 b() {
        Activity activity = this.a.get();
        a(activity, 1);
        jq6 jq6 = this.b.get();
        a(jq6, 2);
        kq6 kq6 = this.c.get();
        a(kq6, 3);
        return new bq6(activity, jq6, kq6);
    }
}
