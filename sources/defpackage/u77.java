package defpackage;

import com.spotify.music.podcastinteractivity.di.a;

/* renamed from: u77  reason: default package */
public final class u77 implements fjf<a> {
    private final wlf<String> a;

    public u77(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h77(this.a.get());
    }
}
