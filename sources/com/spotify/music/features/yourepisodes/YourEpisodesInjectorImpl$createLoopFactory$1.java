package com.spotify.music.features.yourepisodes;

import com.spotify.mobius.e0;
import com.spotify.music.features.yourepisodes.domain.HeaderAction;
import com.spotify.music.features.yourepisodes.domain.b;
import com.spotify.music.features.yourepisodes.domain.e;
import com.spotify.music.features.yourepisodes.domain.f;
import com.spotify.music.features.yourepisodes.domain.j;
import com.spotify.music.features.yourepisodes.domain.k;
import com.spotify.music.features.yourepisodes.domain.l;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class YourEpisodesInjectorImpl$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<l, j, e0<l, f>> {
    public static final YourEpisodesInjectorImpl$createLoopFactory$1 a = new YourEpisodesInjectorImpl$createLoopFactory$1();

    YourEpisodesInjectorImpl$createLoopFactory$1() {
        super(2, k.class, "update", "update(Lcom/spotify/music/features/yourepisodes/domain/YourEpisodesModel;Lcom/spotify/music/features/yourepisodes/domain/YourEpisodesEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<l, f> invoke(l lVar, j jVar) {
        e eVar;
        Set set;
        l lVar2 = lVar;
        j jVar2 = jVar;
        h.e(lVar2, "p1");
        h.e(jVar2, "p2");
        h.e(lVar2, "model");
        h.e(jVar2, "event");
        if (jVar2 instanceof j.b) {
            HeaderAction a2 = ((j.b) jVar2).a();
            if (a2 == HeaderAction.PLAY && (lVar2.e() instanceof e.a)) {
                e.a aVar = (e.a) lVar2.e();
                if (lVar2.d().b()) {
                    set = d.G(f.b.a);
                } else {
                    set = d.G(new f.c(new b(aVar.d())));
                }
                e0<l, f> a3 = e0.a(set);
                h.d(a3, "dispatch(playOrPauseEffe…tate, model.playerState))");
                return a3;
            } else if (a2 == HeaderAction.DOWNLOAD && (lVar2.e() instanceof e.a)) {
                e0<l, f> a4 = e0.a(d.G(new f.d(true)));
                h.d(a4, "dispatch(downloadEffect(true))");
                return a4;
            } else if (a2 == HeaderAction.REMOVE_DOWNLOADS && (lVar2.e() instanceof e.a)) {
                e0<l, f> a5 = e0.a(d.G(new f.d(false)));
                h.d(a5, "dispatch(downloadEffect(false))");
                return a5;
            } else if (a2 == HeaderAction.BACK_BUTTON_PRESSED) {
                e0<l, f> a6 = e0.a(d.G(f.a.a));
                h.d(a6, "dispatch(backButtonPressed())");
                return a6;
            } else {
                throw new IllegalStateException();
            }
        } else if (jVar2 instanceof j.f) {
            j.f fVar = (j.f) jVar2;
            e0<l, f> h = e0.h();
            h.d(h, "noChange()");
            return h;
        } else if (jVar2 instanceof j.c) {
            j.c cVar = (j.c) jVar2;
            if (cVar.d().isEmpty()) {
                eVar = e.b.a;
            } else {
                eVar = new e.a(cVar.d(), cVar.e(), cVar.b(), cVar.c());
            }
            e0<l, f> f = e0.f(l.b(lVar2, eVar, null, false, 6));
            h.d(f, "next(model.copy(uiState = nextUiState))");
            return f;
        } else if (jVar2 instanceof j.d) {
            j.d dVar = (j.d) jVar2;
            e0<l, f> f2 = e0.f(l.b(lVar2, new e.c(null), null, false, 6));
            h.d(f2, "next(model.copy(uiState = UiState.Error(error)))");
            return f2;
        } else if (jVar2 instanceof j.e) {
            e0<l, f> f3 = e0.f(l.b(lVar2, null, ((j.e) jVar2).a(), false, 5));
            h.d(f3, "next(model.copy(playerState = newPlayerState))");
            return f3;
        } else if (jVar2 instanceof j.a) {
            e0<l, f> f4 = e0.f(l.b(lVar2, null, null, ((j.a) jVar2).a(), 3));
            h.d(f4, "next(model.copy(contextD… contextDownloadEnabled))");
            return f4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
