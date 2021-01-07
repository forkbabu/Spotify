package com.spotify.music.preview;

import android.media.AudioManager;
import androidx.lifecycle.n;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.y;
import com.spotify.music.preview.v;
import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

public final class w implements v.a {
    private final wlf<n> a;
    private final wlf<d> b;
    private final wlf<y> c;
    private final wlf<k.a> d;
    private final wlf<g<PlayerState>> e;
    private final wlf<com.spotify.mobile.android.rx.w> f;
    private final wlf<io.reactivex.y> g;
    private final wlf<AudioManager> h;
    private final wlf<cqe> i;
    private final wlf<qxc> j;

    public w(wlf<n> wlf, wlf<d> wlf2, wlf<y> wlf3, wlf<k.a> wlf4, wlf<g<PlayerState>> wlf5, wlf<com.spotify.mobile.android.rx.w> wlf6, wlf<io.reactivex.y> wlf7, wlf<AudioManager> wlf8, wlf<cqe> wlf9, wlf<qxc> wlf10) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // com.spotify.music.preview.v.a
    public v create() {
        n nVar = this.a.get();
        a(nVar, 1);
        n nVar2 = nVar;
        d dVar = this.b.get();
        a(dVar, 2);
        d dVar2 = dVar;
        y yVar = this.c.get();
        k.a aVar = this.d.get();
        a(aVar, 4);
        k.a aVar2 = aVar;
        g<PlayerState> gVar = this.e.get();
        a(gVar, 5);
        g<PlayerState> gVar2 = gVar;
        com.spotify.mobile.android.rx.w wVar = this.f.get();
        a(wVar, 6);
        com.spotify.mobile.android.rx.w wVar2 = wVar;
        io.reactivex.y yVar2 = this.g.get();
        a(yVar2, 7);
        io.reactivex.y yVar3 = yVar2;
        AudioManager audioManager = this.h.get();
        a(audioManager, 8);
        AudioManager audioManager2 = audioManager;
        cqe cqe = this.i.get();
        a(cqe, 9);
        cqe cqe2 = cqe;
        qxc qxc = this.j.get();
        a(qxc, 10);
        return new PreviewPlayerImpl(nVar2, dVar2, yVar, aVar2, gVar2, wVar2, yVar3, audioManager2, cqe2, qxc);
    }
}
