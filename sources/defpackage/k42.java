package defpackage;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;

/* renamed from: k42  reason: default package */
public final class k42 implements fjf<j42> {
    private final wlf<Context> a;
    private final wlf<c> b;

    public k42(wlf<Context> wlf, wlf<c> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j42(this.a.get(), this.b.get());
    }
}
