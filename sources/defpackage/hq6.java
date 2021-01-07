package defpackage;

import android.app.Activity;
import com.spotify.music.navigation.t;

/* renamed from: hq6  reason: default package */
public final class hq6 implements fjf<gq6> {
    private final wlf<Activity> a;
    private final wlf<t> b;

    public hq6(wlf<Activity> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gq6(this.a, this.b);
    }
}
