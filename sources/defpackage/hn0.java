package defpackage;

import android.content.Context;
import com.spotify.googleauth.b;
import com.spotify.http.q;

/* renamed from: hn0  reason: default package */
public final class hn0 implements fjf<q> {
    private final wlf<Context> a;

    public hn0(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b.b(this.a.get());
    }
}
