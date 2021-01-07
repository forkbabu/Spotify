package defpackage;

import com.spotify.music.inappmessaging.b;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: np1  reason: default package */
public final class np1 implements fjf<mp1> {
    private final wlf<qp1> a;
    private final wlf<b> b;
    private final wlf<s<Boolean>> c;
    private final wlf<y> d;

    public np1(wlf<qp1> wlf, wlf<b> wlf2, wlf<s<Boolean>> wlf3, wlf<y> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mp1(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
