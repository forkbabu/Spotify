package defpackage;

import com.spotify.libs.search.history.i;
import com.spotify.music.features.assistedcuration.search.AssistedCurationSearchLogger;
import com.spotify.music.features.assistedcuration.search.m;

/* renamed from: x14  reason: default package */
public final class x14 implements fjf<w14> {
    private final wlf<m> a;
    private final wlf<AssistedCurationSearchLogger> b;
    private final wlf<i> c;
    private final wlf<s6b> d;
    private final wlf<c8b> e;

    public x14(wlf<m> wlf, wlf<AssistedCurationSearchLogger> wlf2, wlf<i> wlf3, wlf<s6b> wlf4, wlf<c8b> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static x14 a(wlf<m> wlf, wlf<AssistedCurationSearchLogger> wlf2, wlf<i> wlf3, wlf<s6b> wlf4, wlf<c8b> wlf5) {
        return new x14(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w14(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
