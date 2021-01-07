package defpackage;

import com.spotify.http.w;
import com.squareup.picasso.l;
import com.squareup.picasso.v;

/* renamed from: ac3  reason: default package */
public final class ac3 implements fjf<l> {
    private final wlf<w> a;

    public ac3(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.a.get().b());
    }
}
