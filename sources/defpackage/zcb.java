package defpackage;

import com.spotify.music.lyrics.core.experience.model.b;
import defpackage.ycb;
import kotlin.jvm.internal.h;

/* renamed from: zcb  reason: default package */
public final class zcb implements fjf<xn1<b>> {
    private final wlf<yn1> a;

    public zcb(wlf<yn1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        yn1 yn1 = this.a.get();
        ycb.a aVar = ycb.a;
        h.e(yn1, "rxSessionState");
        return new xn1(yn1);
    }
}
