package com.spotify.pageloader.rx.effecthandler;

import com.spotify.pageloader.rx.effecthandler.ObservableLoadableEffectHandler;
import defpackage.kud;
import io.reactivex.functions.g;
import io.reactivex.r;
import kotlin.jvm.internal.h;

final class a<T> implements g<r<T>> {
    final /* synthetic */ ObservableLoadableEffectHandler.a a;

    a(ObservableLoadableEffectHandler.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public void accept(Object obj) {
        r rVar = (r) obj;
        da2 da2 = this.a.d;
        h.d(rVar, "it");
        da2.accept(new kud.a(rVar));
    }
}
