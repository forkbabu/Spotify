package defpackage;

import com.spotify.inappmessaging.m;
import com.spotify.inappmessaging.p;
import retrofit2.w;

/* renamed from: a28  reason: default package */
public final class a28 implements fjf<m> {
    private final wlf<w> a;

    public a28(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p(this.a.get(), true);
    }
}
