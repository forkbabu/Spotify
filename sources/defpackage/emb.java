package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.g;

/* renamed from: emb  reason: default package */
public final class emb implements fjf<dmb> {
    private final wlf<g<ImmutableList<NowPlayingWidget>>> a;
    private final wlf<Resources> b;

    public emb(wlf<g<ImmutableList<NowPlayingWidget>>> wlf, wlf<Resources> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dmb(this.a.get(), this.b.get());
    }
}
