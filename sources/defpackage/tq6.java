package defpackage;

import android.app.Activity;
import com.spotify.libs.glue.custom.playbutton.c;

/* renamed from: tq6  reason: default package */
public final class tq6 implements fjf<sq6> {
    private final wlf<Activity> a;
    private final wlf<pq6> b;
    private final wlf<c.a> c;

    public tq6(wlf<Activity> wlf, wlf<pq6> wlf2, wlf<c.a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sq6(this.a, this.b, this.c);
    }
}
