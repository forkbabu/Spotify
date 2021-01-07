package defpackage;

import android.content.Context;
import com.spotify.image.provider.MediaUriUtil;

/* renamed from: sj1  reason: default package */
public final class sj1 implements fjf<rj1> {
    private final wlf<MediaUriUtil> a;
    private final wlf<Context> b;
    private final wlf<c4e> c;

    public sj1(wlf<MediaUriUtil> wlf, wlf<Context> wlf2, wlf<c4e> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rj1(this.a.get(), this.b.get(), this.c.get());
    }
}
