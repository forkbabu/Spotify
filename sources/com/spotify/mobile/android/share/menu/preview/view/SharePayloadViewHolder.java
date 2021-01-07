package com.spotify.mobile.android.share.menu.preview.view;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.share.menu.preview.domain.b;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class SharePayloadViewHolder extends RecyclerView.b0 {
    private final SharePayloadView C;
    private final PublishSubject<Integer> D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePayloadViewHolder(SharePayloadView sharePayloadView, PublishSubject<Integer> publishSubject) {
        super(sharePayloadView);
        h.e(sharePayloadView, "sharePayloadView");
        h.e(publishSubject, "retryClickSubject");
        this.C = sharePayloadView;
        this.D = publishSubject;
    }

    public final void j0(b bVar, int i) {
        h.e(bVar, "payloadState");
        this.C.D(bVar);
        this.C.setOnRetryClicked$libs_share_preview_menu(new SharePayloadViewHolder$bind$1(this, i));
    }
}
