package defpackage;

import android.app.Activity;
import com.spotify.music.navigation.t;

/* renamed from: gq6  reason: default package */
public final class gq6 {
    private final wlf<Activity> a;
    private final wlf<t> b;

    public gq6(wlf<Activity> wlf, wlf<t> wlf2) {
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

    public eq6 b() {
        Activity activity = this.a.get();
        a(activity, 1);
        t tVar = this.b.get();
        a(tVar, 2);
        return new eq6(activity, tVar);
    }
}
