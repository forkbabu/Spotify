package com.spotify.pageloader.rx.effecthandler;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class EmitterStore$observe$1 extends Lambda implements cmf<f> {
    final /* synthetic */ nmf $observer;
    final /* synthetic */ EmitterStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EmitterStore$observe$1(EmitterStore emitterStore, nmf nmf) {
        super(0);
        this.this$0 = emitterStore;
        this.$observer = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.a.remove(this.$observer);
        return f.a;
    }
}
