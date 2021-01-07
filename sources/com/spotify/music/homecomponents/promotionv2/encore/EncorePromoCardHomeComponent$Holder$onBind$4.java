package com.spotify.music.homecomponents.promotionv2.encore;

import com.spotify.music.homecomponents.promotionv2.encore.EncorePromoCardHomeComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EncorePromoCardHomeComponent$Holder$onBind$4 extends Lambda implements cmf<f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ EncorePromoCardHomeComponent.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncorePromoCardHomeComponent$Holder$onBind$4(EncorePromoCardHomeComponent.Holder holder, s81 s81) {
        super(0);
        this.this$0 = holder;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        w50 C = EncorePromoCardHomeComponent.Holder.C(this.this$0);
        s81 s81 = this.$data;
        V v = this.this$0.a;
        h.d(v, "view");
        C.a(s81, v, h60.a);
        return f.a;
    }
}
