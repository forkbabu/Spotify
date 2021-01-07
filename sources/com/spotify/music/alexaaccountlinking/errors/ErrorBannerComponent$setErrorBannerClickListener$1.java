package com.spotify.music.alexaaccountlinking.errors;

import android.view.ViewGroup;
import com.spotify.encore.consumer.components.error.api.errorbanner.ErrorBanner;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class ErrorBannerComponent$setErrorBannerClickListener$1 extends Lambda implements nmf<ErrorBanner.Events, f> {
    final /* synthetic */ ViewGroup $parentView;
    final /* synthetic */ a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ErrorBannerComponent$setErrorBannerClickListener$1(a aVar, ViewGroup viewGroup) {
        super(1);
        this.this$0 = aVar;
        this.$parentView = viewGroup;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ErrorBanner.Events events) {
        ErrorBanner.Events events2 = events;
        h.e(events2, "it");
        if (h.a(events2, ErrorBanner.Events.Clicked.INSTANCE)) {
            this.this$0.a(this.$parentView);
        }
        return f.a;
    }
}
