package com.spotify.mobile.android.share.menu.preview.view;

import com.spotify.mobile.android.share.menu.preview.domain.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class SharePreviewMenuViews$connect$disposable$1 extends FunctionReferenceImpl implements nmf<d, f> {
    SharePreviewMenuViews$connect$disposable$1(da2 da2) {
        super(1, da2, da2.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(d dVar) {
        ((da2) this.receiver).accept(dVar);
        return f.a;
    }
}
