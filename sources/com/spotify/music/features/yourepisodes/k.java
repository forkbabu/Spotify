package com.spotify.music.features.yourepisodes;

import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.features.yourepisodes.interactor.c;
import com.spotify.music.features.yourepisodes.view.b;
import com.spotify.music.features.yourepisodes.view.b0;
import com.spotify.music.features.yourepisodes.view.e;
import com.spotify.music.features.yourepisodes.view.n;
import com.spotify.music.features.yourepisodes.view.p;
import com.spotify.music.features.yourepisodes.view.u;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

final class k<T, R> implements l<s<c>, n> {
    final /* synthetic */ w a;
    final /* synthetic */ b0 b;
    final /* synthetic */ p c;
    final /* synthetic */ b f;
    final /* synthetic */ u n;
    final /* synthetic */ e o;
    final /* synthetic */ EncoreConsumerEntryPoint p;

    k(w wVar, b0 b0Var, p pVar, b bVar, u uVar, e eVar, EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        this.a = wVar;
        this.b = b0Var;
        this.c = pVar;
        this.f = bVar;
        this.n = uVar;
        this.o = eVar;
        this.p = encoreConsumerEntryPoint;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public n apply(s<c> sVar) {
        s<c> sVar2 = sVar;
        h.e(sVar2, "data");
        return new n(sVar2, this.a, this.b, this.c, this.f, this.n, this.o, this.p);
    }
}
