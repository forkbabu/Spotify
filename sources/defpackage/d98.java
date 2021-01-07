package defpackage;

import com.spotify.music.features.search.SearchFragment;
import defpackage.yg8;

/* renamed from: d98  reason: default package */
public final class d98 implements fjf<yg8.e> {
    private final wlf<SearchFragment> a;

    public d98(wlf<SearchFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f78(this.a.get());
    }
}
