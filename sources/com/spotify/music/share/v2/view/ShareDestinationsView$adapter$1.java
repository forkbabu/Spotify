package com.spotify.music.share.v2.view;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ShareDestinationsView$adapter$1 extends Lambda implements rmf<o8e, Integer, f> {
    final /* synthetic */ ShareDestinationsView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShareDestinationsView$adapter$1(ShareDestinationsView shareDestinationsView) {
        super(2);
        this.this$0 = shareDestinationsView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(o8e o8e, Integer num) {
        o8e o8e2 = o8e;
        int intValue = num.intValue();
        h.e(o8e2, "destination");
        rmf C = ShareDestinationsView.C(this.this$0);
        if (C != null) {
            f fVar = (f) C.invoke(o8e2, Integer.valueOf(intValue));
        }
        return f.a;
    }
}
