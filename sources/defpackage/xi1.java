package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.music.libs.podcast.loader.i;
import io.reactivex.s;

/* renamed from: xi1  reason: default package */
public final class xi1 implements fjf<wi1> {
    private final wlf<Context> a;
    private final wlf<s<String>> b;
    private final wlf<i> c;
    private final wlf<o> d;
    private final wlf<cf0> e;

    public xi1(wlf<Context> wlf, wlf<s<String>> wlf2, wlf<i> wlf3, wlf<o> wlf4, wlf<cf0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wi1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
