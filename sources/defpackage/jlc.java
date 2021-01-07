package defpackage;

import com.spotify.music.podcast.freetierlikes.tabs.followed.h;
import com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.d;
import com.spotify.pageloader.PageLoaderView;
import io.reactivex.s;

/* renamed from: jlc  reason: default package */
public final class jlc implements fjf<ilc> {
    private final wlf<cbc<s<ryd>>> a;
    private final wlf<PageLoaderView.a<s<ryd>>> b;
    private final wlf<d> c;
    private final wlf<h> d;

    public jlc(wlf<cbc<s<ryd>>> wlf, wlf<PageLoaderView.a<s<ryd>>> wlf2, wlf<d> wlf3, wlf<h> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ilc(this.a.get(), this.b.get(), ejf.a(this.c), this.d.get());
    }
}
