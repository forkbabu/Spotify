package com.spotify.mobile.android.share.menu.preview.view;

import com.spotify.mobile.android.share.menu.preview.domain.b;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SharePreviewMenuViews$diffuser$2 extends FunctionReferenceImpl implements nmf<List<? extends b>, f> {
    SharePreviewMenuViews$diffuser$2(SharePreviewMenuViews sharePreviewMenuViews) {
        super(1, sharePreviewMenuViews, SharePreviewMenuViews.class, "showPayloadStateList", "showPayloadStateList(Ljava/util/List;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(List<? extends b> list) {
        List<? extends b> list2 = list;
        h.e(list2, "p1");
        SharePreviewMenuViews.h((SharePreviewMenuViews) this.receiver, list2);
        return f.a;
    }
}
