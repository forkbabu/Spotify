package com.spotify.music.premiummini.ui;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class PremiumMiniDialogsImpl$showRemoveAllSongsDialog$1 extends Lambda implements cmf<f> {
    final /* synthetic */ cmf $confirmClickListener;
    final /* synthetic */ PremiumMiniDialogsImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PremiumMiniDialogsImpl$showRemoveAllSongsDialog$1(PremiumMiniDialogsImpl premiumMiniDialogsImpl, cmf cmf) {
        super(0);
        this.this$0 = premiumMiniDialogsImpl;
        this.$confirmClickListener = cmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        PremiumMiniDialogsImpl.d(this.this$0).a(PremiumMiniDialogsImpl.c(this.this$0).b().d().a());
        this.$confirmClickListener.invoke();
        return f.a;
    }
}
