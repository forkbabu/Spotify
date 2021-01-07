package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.settings.a;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public class h1 {
    private final ba9 a;
    private final da9 b;
    private final y99 c;
    private final ga9 d;
    private final fa9 e;
    private final ea9 f;
    private final aa9 g;
    private final ca9 h;
    private final e1 i;
    private final j79 j;
    private final g<PlayerState> k;
    private final a l;
    private final md9 m;
    private final s<Boolean> n;
    private final y o;
    private final y p;

    public h1(ba9 ba9, da9 da9, y99 y99, ga9 ga9, fa9 fa9, ea9 ea9, aa9 aa9, ca9 ca9, e1 e1Var, j79 j79, g<PlayerState> gVar, a aVar, md9 md9, s<Boolean> sVar, y yVar, y yVar2) {
        this.a = ba9;
        this.b = da9;
        this.c = y99;
        this.d = ga9;
        this.e = fa9;
        this.f = ea9;
        this.g = aa9;
        this.h = ca9;
        this.i = e1Var;
        this.j = j79;
        this.k = gVar;
        this.l = aVar;
        this.m = md9;
        this.n = sVar;
        this.o = yVar;
        this.p = yVar2;
    }

    public MobiusLoop.g<MusicPagesModel, s0> a(g1 g1Var, MusicPagesModel musicPagesModel) {
        y0 y0Var = y0.a;
        ba9 ba9 = this.a;
        da9 da9 = this.b;
        y99 y99 = this.c;
        ga9 ga9 = this.d;
        fa9 fa9 = this.e;
        ea9 ea9 = this.f;
        aa9 aa9 = this.g;
        ca9 ca9 = this.h;
        m<r0, s0> f2 = i.f();
        z99[] z99Arr = {ba9, da9, y99, ga9, fa9, ea9, aa9, ca9};
        for (int i2 = 0; i2 < 8; i2++) {
            z99Arr[i2].a(f2);
        }
        MobiusLoop.f h2 = i.c(y0Var, f2.i()).e(v0.a).b(new j(this)).d(new i(this)).h(sa9.c(g1Var, this.j, this.k, this.l, this.m, this.n, this.p));
        this.i.getClass();
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_MOBIUS_LOGGING;
        return z.b(h2, musicPagesModel, u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.o);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.o);
    }
}
