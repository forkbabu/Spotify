package defpackage;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;

/* renamed from: u7a  reason: default package */
public final class u7a implements fjf<t7a> {
    private final wlf<Context> a;
    private final wlf<c> b;

    public u7a(wlf<Context> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t7a(this.a.get(), this.b.get());
    }
}
