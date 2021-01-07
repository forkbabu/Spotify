package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.connection.l;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.y;

/* renamed from: zd9  reason: default package */
public final class zd9 implements fjf<yd9> {
    private final wlf<n1a> a;
    private final wlf<CollectionStateProvider> b;
    private final wlf<c> c;
    private final wlf<m> d;
    private final wlf<l> e;
    private final wlf<y> f;

    public zd9(wlf<n1a> wlf, wlf<CollectionStateProvider> wlf2, wlf<c> wlf3, wlf<m> wlf4, wlf<l> wlf5, wlf<y> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yd9(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
