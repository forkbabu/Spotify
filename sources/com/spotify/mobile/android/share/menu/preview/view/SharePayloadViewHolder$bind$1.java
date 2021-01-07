package com.spotify.mobile.android.share.menu.preview.view;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class SharePayloadViewHolder$bind$1 extends Lambda implements cmf<f> {
    final /* synthetic */ int $payloadIndex;
    final /* synthetic */ SharePayloadViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharePayloadViewHolder$bind$1(SharePayloadViewHolder sharePayloadViewHolder, int i) {
        super(0);
        this.this$0 = sharePayloadViewHolder;
        this.$payloadIndex = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        SharePayloadViewHolder.h0(this.this$0).onNext(Integer.valueOf(this.$payloadIndex));
        return f.a;
    }
}
