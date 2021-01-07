package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.json.g;

/* renamed from: spd  reason: default package */
public final class spd implements fjf<rpd> {
    private final wlf<Context> a;
    private final wlf<i> b;
    private final wlf<g> c;

    public spd(wlf<Context> wlf, wlf<i> wlf2, wlf<g> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rpd(this.a.get(), this.b.get(), this.c.get());
    }
}
