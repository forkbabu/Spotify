package defpackage;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;

/* renamed from: x8a  reason: default package */
public final class x8a implements fjf<u8a> {
    private final wlf<y8a> a;
    private final wlf<Context> b;
    private final wlf<c> c;

    public x8a(wlf<y8a> wlf, wlf<Context> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new u8a(this.a.get(), this.b.get(), this.c.get());
    }
}
