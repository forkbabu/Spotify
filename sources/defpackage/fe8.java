package defpackage;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;

/* renamed from: fe8  reason: default package */
public final class fe8 implements fjf<ee8> {
    private final wlf<Context> a;
    private final wlf<b42> b;
    private final wlf<c.a> c;
    private final wlf<p71> d;

    public fe8(wlf<Context> wlf, wlf<b42> wlf2, wlf<c.a> wlf3, wlf<p71> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ee8(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
