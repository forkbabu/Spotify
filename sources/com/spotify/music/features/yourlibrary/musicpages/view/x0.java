package com.spotify.music.features.yourlibrary.musicpages.view;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.libs.viewuri.c;
import defpackage.d42;
import defpackage.w22;

public class x0 implements b4<MusicItem> {
    private final e1 a;
    private final MusicPagesLogger b;
    private final l22 c;
    private final f f;
    private final u22 n;
    private final b42 o;
    private final c p;

    public x0(e1 e1Var, MusicPagesLogger musicPagesLogger, l22 l22, f fVar, u22 u22, b42 b42, c cVar) {
        this.a = e1Var;
        this.b = musicPagesLogger;
        this.c = l22;
        this.f = fVar;
        this.n = u22;
        this.o = b42;
        this.p = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(MusicItem musicItem) {
        MusicItem musicItem2 = musicItem;
        int ordinal = musicItem2.type().ordinal();
        if (ordinal == 1) {
            return this.c.a(musicItem2.A(), musicItem2.w()).a(this.p).g(true).c(true).d(this.a.i()).b();
        }
        if (ordinal == 2 || ordinal == 3) {
            w22.d d = this.n.a(musicItem2.A(), musicItem2.w()).a(this.p).d(false);
            d.i(true);
            d.c(true);
            d.f(false);
            return d.b();
        } else if (ordinal == 16) {
            return this.f.a(musicItem2.A(), musicItem2.w()).a(this.p).d(this.a.i()).c(true).b();
        } else {
            if (ordinal == 20) {
                this.b.K(musicItem2.A(), musicItem2.k());
                d42.f w = this.o.a(musicItem2.A(), musicItem2.w(), musicItem2.y().e()).a(this.p).t(true).g(true).r(true).w(false);
                w.i(false);
                w.l(false);
                w.f(false);
                w.c(!musicItem2.y().h());
                w.n(this.a.w());
                return w.b();
            } else if (ordinal == 21) {
                if (musicItem2.y().m()) {
                    this.b.J(musicItem2.A(), musicItem2.k());
                } else {
                    this.b.K(musicItem2.A(), musicItem2.k());
                }
                d42.f w2 = this.o.a(musicItem2.A(), musicItem2.w(), musicItem2.y().e()).a(this.p).t(true).g(true).r(true).w(false);
                w2.i(false);
                w2.l(true);
                w2.f(true);
                w2.c(!musicItem2.y().h());
                return w2.b();
            } else {
                throw new IllegalArgumentException("Unsupported type");
            }
        }
    }
}
