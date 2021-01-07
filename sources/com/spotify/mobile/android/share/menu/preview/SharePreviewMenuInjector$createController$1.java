package com.spotify.mobile.android.share.menu.preview;

import com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel;
import com.spotify.mobile.android.share.menu.preview.domain.b;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import com.spotify.mobile.android.share.menu.preview.domain.e;
import com.spotify.mobius.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SharePreviewMenuInjector$createController$1 extends FunctionReferenceImpl implements nmf<SharePreviewMenuModel, s<SharePreviewMenuModel, c>> {
    public static final SharePreviewMenuInjector$createController$1 a = new SharePreviewMenuInjector$createController$1();

    SharePreviewMenuInjector$createController$1() {
        super(1, e.class, "init", "init(Lcom/spotify/mobile/android/share/menu/preview/domain/SharePreviewMenuModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<SharePreviewMenuModel, c> invoke(SharePreviewMenuModel sharePreviewMenuModel) {
        SharePreviewMenuModel sharePreviewMenuModel2 = sharePreviewMenuModel;
        h.e(sharePreviewMenuModel2, "p1");
        h.e(sharePreviewMenuModel2, "model");
        List<b> c = sharePreviewMenuModel2.c();
        ArrayList arrayList = new ArrayList(d.e(c, 10));
        int i = 0;
        for (T t : c) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new c.b(i));
                i = i2;
            } else {
                d.L();
                throw null;
            }
        }
        s<SharePreviewMenuModel, c> c2 = s.c(sharePreviewMenuModel2, d.Z(arrayList));
        h.d(c2, "First.first(\n        mod…hPayloadEffectSet()\n    )");
        return c2;
    }
}
