package com.spotify.encore.consumer.elements.quickactions;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class QuickActionView$render$2 extends Lambda implements nmf<f, f> {
    final /* synthetic */ QuickActionView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuickActionView$render$2(QuickActionView quickActionView) {
        super(1);
        this.this$0 = quickActionView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(f fVar) {
        invoke(fVar);
        return f.a;
    }

    public final void invoke(f fVar) {
        h.e(fVar, "it");
        this.this$0.eventHandler.invoke(Events.ProfileClicked);
    }
}
