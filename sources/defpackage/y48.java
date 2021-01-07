package defpackage;

import android.app.Activity;
import defpackage.w48;

/* renamed from: y48  reason: default package */
public final class y48 implements w48.a {
    private final wlf<Activity> a;
    private final wlf<m48> b;

    public y48(wlf<Activity> wlf, wlf<m48> wlf2) {
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

    public w48 b(q48 q48) {
        Activity activity = this.a.get();
        a(activity, 1);
        m48 m48 = this.b.get();
        a(m48, 2);
        a(q48, 3);
        return new x48(activity, m48, q48);
    }
}
