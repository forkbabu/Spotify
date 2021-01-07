package com.spotify.mobile.android.share.menu.preview;

import com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import com.spotify.mobile.android.share.menu.preview.domain.e;
import com.spotify.mobius.e0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SharePreviewMenuInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<SharePreviewMenuModel, d, e0<SharePreviewMenuModel, c>> {
    public static final SharePreviewMenuInjector$createLoopFactory$1 a = new SharePreviewMenuInjector$createLoopFactory$1();

    SharePreviewMenuInjector$createLoopFactory$1() {
        super(2, e.class, "update", "update(Lcom/spotify/mobile/android/share/menu/preview/domain/SharePreviewMenuModel;Lcom/spotify/mobile/android/share/menu/preview/domain/SharePreviewMenuEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<SharePreviewMenuModel, c> invoke(SharePreviewMenuModel sharePreviewMenuModel, d dVar) {
        SharePreviewMenuModel sharePreviewMenuModel2 = sharePreviewMenuModel;
        d dVar2 = dVar;
        h.e(sharePreviewMenuModel2, "p1");
        h.e(dVar2, "p2");
        return e.a(sharePreviewMenuModel2, dVar2);
    }
}
