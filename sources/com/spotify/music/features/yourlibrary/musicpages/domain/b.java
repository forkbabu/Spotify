package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.Set;

public final /* synthetic */ class b implements ti0 {
    public final /* synthetic */ MusicPagesModel a;

    public /* synthetic */ b(MusicPagesModel musicPagesModel) {
        this.a = musicPagesModel;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        Set set;
        s0.j jVar = (s0.j) obj;
        MusicItem Q = jVar.Q();
        if (Q.o()) {
            boolean z = !Q.y().h();
            r0.l1 l1Var = new r0.l1(Q.A(), Q.y().e(), z);
            if (z) {
                return e0.a(z42.l(l1Var, new r0.s(Q.A(), jVar.R())));
            }
            r0.b0 b0Var = new r0.b0(Q.A(), jVar.R());
            String l = Q.y().l();
            l.getClass();
            return e0.a(z42.l(l1Var, b0Var, new r0.g1(l)));
        } else if (Q.type() != MusicItem.Type.ALBUM) {
            return e0.h();
        } else {
            boolean z2 = !Q.i();
            r0.h1 h1Var = new r0.h1(Q.A(), z2);
            if (z2) {
                set = z42.l(h1Var, new r0.r(Q.A(), jVar.R()));
            } else {
                set = z42.l(h1Var);
            }
            return e0.a(set);
        }
    }
}
