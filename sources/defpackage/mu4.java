package defpackage;

import android.content.Context;
import com.spotify.playlist.endpoints.p;

/* renamed from: mu4  reason: default package */
public final class mu4 implements fjf<lu4> {
    private final wlf<Context> a;
    private final wlf<p> b;

    public mu4(wlf<Context> wlf, wlf<p> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lu4(this.a.get(), this.b.get());
    }
}
