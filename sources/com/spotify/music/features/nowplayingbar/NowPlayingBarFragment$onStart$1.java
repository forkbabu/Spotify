package com.spotify.music.features.nowplayingbar;

import com.spotify.music.features.nowplayingbar.domain.f;
import com.spotify.music.features.nowplayingbar.domain.h;
import com.spotify.music.features.nowplayingbar.view.e;
import com.spotify.music.features.nowplayingbar.view.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class NowPlayingBarFragment$onStart$1 extends FunctionReferenceImpl implements nmf<f, lu5> {
    public static final NowPlayingBarFragment$onStart$1 a = new NowPlayingBarFragment$onStart$1();

    NowPlayingBarFragment$onStart$1() {
        super(1, r0.class, "map", "map(Lcom/spotify/music/features/nowplayingbar/domain/NowPlayingBarModel;)Lcom/spotify/music/features/nowplayingbar/view/model/NowPlayingBarViewState;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public lu5 invoke(f fVar) {
        Object obj;
        f fVar2 = fVar;
        h d = fVar2.d();
        com.spotify.music.features.nowplayingbar.view.f fVar3 = com.spotify.music.features.nowplayingbar.view.f.a;
        e eVar = new e(fVar2);
        d.getClass();
        kotlin.jvm.internal.h.e(fVar3, "nt");
        kotlin.jvm.internal.h.e(eVar, "wt");
        if (d instanceof h.a) {
            obj = fVar3.invoke(d);
        } else if (d instanceof h.b) {
            obj = eVar.invoke(d);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (lu5) obj;
    }
}
