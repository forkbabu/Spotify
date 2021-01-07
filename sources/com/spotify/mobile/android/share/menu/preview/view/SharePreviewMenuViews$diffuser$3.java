package com.spotify.mobile.android.share.menu.preview.view;

import com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SharePreviewMenuViews$diffuser$3 extends PropertyReference1Impl {
    public static final g a = new SharePreviewMenuViews$diffuser$3();

    SharePreviewMenuViews$diffuser$3() {
        super(SharePreviewMenuModel.class, "destinationListState", "getDestinationListState()Lcom/spotify/mobile/android/share/menu/preview/domain/DestinationListState;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.g
    public Object get(Object obj) {
        return ((SharePreviewMenuModel) obj).b();
    }
}
