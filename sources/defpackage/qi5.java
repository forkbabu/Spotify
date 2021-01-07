package defpackage;

import com.spotify.music.premiummini.k;

/* renamed from: qi5  reason: default package */
public final class qi5 implements fjf<pi5> {
    private final wlf<k> a;

    public qi5(wlf<k> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pi5(this.a.get());
    }
}
