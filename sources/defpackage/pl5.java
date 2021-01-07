package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.music.features.home.common.cache.a;
import com.spotify.music.features.home.common.cache.b;
import com.spotify.music.features.home.common.datasource.j;
import io.reactivex.s;

/* renamed from: pl5  reason: default package */
public final class pl5 implements fjf<ol5> {
    private final wlf<a<byte[]>> a;
    private final wlf<j> b;
    private final wlf<nf5> c;
    private final wlf<b> d;
    private final wlf<qf5> e;
    private final wlf<li5> f;
    private final wlf<s<ng5>> g;
    private final wlf<kg5> h;
    private final wlf<s<RecentlyPlayedItems>> i;
    private final wlf<txc> j;

    public pl5(wlf<a<byte[]>> wlf, wlf<j> wlf2, wlf<nf5> wlf3, wlf<b> wlf4, wlf<qf5> wlf5, wlf<li5> wlf6, wlf<s<ng5>> wlf7, wlf<kg5> wlf8, wlf<s<RecentlyPlayedItems>> wlf9, wlf<txc> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    public static pl5 a(wlf<a<byte[]>> wlf, wlf<j> wlf2, wlf<nf5> wlf3, wlf<b> wlf4, wlf<qf5> wlf5, wlf<li5> wlf6, wlf<s<ng5>> wlf7, wlf<kg5> wlf8, wlf<s<RecentlyPlayedItems>> wlf9, wlf<txc> wlf10) {
        return new pl5(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ol5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
