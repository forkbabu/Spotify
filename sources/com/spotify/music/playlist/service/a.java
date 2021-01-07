package com.spotify.music.playlist.service;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.i;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

final class a<V> implements Callable<e> {
    final /* synthetic */ boolean a;
    final /* synthetic */ i b;
    final /* synthetic */ String c;

    a(boolean z, i iVar, String str) {
        this.a = z;
        this.b = iVar;
        this.c = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public e call() {
        if (!this.a) {
            return b.a;
        }
        i iVar = this.b;
        String str = this.c;
        Optional<ane> absent = Optional.absent();
        h.d(absent, "Optional.absent()");
        return iVar.c(str, absent, true);
    }
}
