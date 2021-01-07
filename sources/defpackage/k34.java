package defpackage;

import com.spotify.music.libs.restrictedcontent.transformer.h;
import io.reactivex.y;

/* renamed from: k34  reason: default package */
public final class k34 implements fjf<j34> {
    private final wlf<y> a;
    private final wlf<String> b;
    private final wlf<sg0<b91, b91>> c;
    private final wlf<ch3> d;
    private final wlf<h> e;

    public k34(wlf<y> wlf, wlf<String> wlf2, wlf<sg0<b91, b91>> wlf3, wlf<ch3> wlf4, wlf<h> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j34(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
