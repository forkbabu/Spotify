package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.database.a;
import com.google.android.exoplayer2.offline.i;
import com.google.android.exoplayer2.offline.n;
import com.spotify.mobile.android.video.offline.v;

/* renamed from: g82  reason: default package */
public final class g82 implements fjf<n> {
    private final wlf<Context> a;
    private final wlf<a> b;
    private final wlf<v> c;

    public g82(wlf<Context> wlf, wlf<a> wlf2, wlf<v> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), new i(this.b.get()), this.c.get());
    }
}
