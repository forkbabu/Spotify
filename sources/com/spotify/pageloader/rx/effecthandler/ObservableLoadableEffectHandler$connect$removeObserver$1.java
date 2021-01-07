package com.spotify.pageloader.rx.effecthandler;

import defpackage.kud;
import io.reactivex.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ObservableLoadableEffectHandler$connect$removeObserver$1 extends Lambda implements nmf<f<T>, kotlin.f> {
    final /* synthetic */ da2 $dispatchEvent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ObservableLoadableEffectHandler$connect$removeObserver$1(da2 da2) {
        super(1);
        this.$dispatchEvent = da2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.nmf
    public kotlin.f invoke(Object obj) {
        f fVar = (f) obj;
        h.e(fVar, "emitter");
        this.$dispatchEvent.accept(new kud.b(fVar));
        return kotlin.f.a;
    }
}
