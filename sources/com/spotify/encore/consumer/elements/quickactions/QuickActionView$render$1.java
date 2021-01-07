package com.spotify.encore.consumer.elements.quickactions;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class QuickActionView$render$1 extends Lambda implements nmf<Boolean, f> {
    final /* synthetic */ QuickActionView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuickActionView$render$1(QuickActionView quickActionView) {
        super(1);
        this.this$0 = quickActionView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return f.a;
    }

    public final void invoke(boolean z) {
        this.this$0.eventHandler.invoke(Events.BanClicked);
    }
}
