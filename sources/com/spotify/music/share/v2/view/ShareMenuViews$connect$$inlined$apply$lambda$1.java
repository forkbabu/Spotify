package com.spotify.music.share.v2.view;

import defpackage.i2d;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ShareMenuViews$connect$$inlined$apply$lambda$1 extends Lambda implements rmf<o8e, Integer, f> {
    final /* synthetic */ da2 $eventConsumer$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShareMenuViews$connect$$inlined$apply$lambda$1(da2 da2) {
        super(2);
        this.$eventConsumer$inlined = da2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(o8e o8e, Integer num) {
        o8e o8e2 = o8e;
        int intValue = num.intValue();
        h.e(o8e2, "destination");
        this.$eventConsumer$inlined.accept(new i2d.e(o8e2, intValue));
        return f.a;
    }
}
