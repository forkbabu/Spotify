package com.spotify.music.alexaaccountlinking.errors;

import android.view.ViewGroup;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class ErrorBannerComponent$setCloseErrorBannerCallback$1 extends Lambda implements cmf<f> {
    final /* synthetic */ ViewGroup $parentView;
    final /* synthetic */ a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ErrorBannerComponent$setCloseErrorBannerCallback$1(a aVar, ViewGroup viewGroup) {
        super(0);
        this.this$0 = aVar;
        this.$parentView = viewGroup;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.this$0.a(this.$parentView);
        return f.a;
    }
}
