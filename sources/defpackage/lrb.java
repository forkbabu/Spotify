package defpackage;

import com.spotify.music.libs.connect.k;
import com.spotify.music.libs.connect.o;

/* renamed from: lrb  reason: default package */
public final class lrb implements fjf<krb> {
    private final wlf<k> a;
    private final wlf<o> b;

    public lrb(wlf<k> wlf, wlf<o> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new krb(this.a.get(), this.b.get());
    }
}
