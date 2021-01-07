package defpackage;

import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.playlist.models.f;
import io.reactivex.s;

/* renamed from: mh1  reason: default package */
public final class mh1 implements fjf<lh1> {
    private final wlf<ki1> a;
    private final wlf<s<f>> b;
    private final wlf<o> c;

    public mh1(wlf<ki1> wlf, wlf<s<f>> wlf2, wlf<o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lh1(this.a.get(), this.b.get(), this.c.get());
    }
}
