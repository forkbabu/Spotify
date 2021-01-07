package defpackage;

import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.music.libs.podcast.loader.k;
import io.reactivex.s;

/* renamed from: bj1  reason: default package */
public final class bj1 implements fjf<aj1> {
    private final wlf<s<String>> a;
    private final wlf<k> b;
    private final wlf<o> c;

    public bj1(wlf<s<String>> wlf, wlf<k> wlf2, wlf<o> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aj1(this.a.get(), this.b.get(), this.c.get());
    }
}
