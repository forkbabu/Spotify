package com.spotify.mobile.android.quotesharing;

import com.spotify.mobile.android.share.menu.preview.api.d;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class QuoteShareActionHandlerImpl$providePayloadProvider$1 extends Lambda implements cmf<d> {
    final /* synthetic */ f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QuoteShareActionHandlerImpl$providePayloadProvider$1(f fVar) {
        super(0);
        this.this$0 = fVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public d invoke() {
        try {
            return f.b(this.this$0);
        } catch (IOException unused) {
            return d.a.a;
        }
    }
}
