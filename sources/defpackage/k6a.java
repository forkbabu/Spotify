package defpackage;

import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.remoteconfig.k5;
import io.reactivex.s;

/* renamed from: k6a  reason: default package */
public final class k6a implements fjf<j6a> {
    private final wlf<s<d7a>> a;
    private final wlf<y> b;
    private final wlf<k5> c;

    public k6a(wlf<s<d7a>> wlf, wlf<y> wlf2, wlf<k5> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j6a(this.a.get(), this.b.get(), this.c);
    }
}
