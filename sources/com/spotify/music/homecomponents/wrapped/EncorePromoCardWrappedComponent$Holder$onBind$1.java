package com.spotify.music.homecomponents.wrapped;

import com.spotify.music.homecomponents.wrapped.EncorePromoCardWrappedComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;
import libs.encore.consumer.components.promo.api.wrapped.PromoCardWrapped$Events;

final class EncorePromoCardWrappedComponent$Holder$onBind$1 extends Lambda implements nmf<PromoCardWrapped$Events, f> {
    final /* synthetic */ s81 $data;
    final /* synthetic */ EncorePromoCardWrappedComponent.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncorePromoCardWrappedComponent$Holder$onBind$1(EncorePromoCardWrappedComponent.Holder holder, s81 s81) {
        super(1);
        this.this$0 = holder;
        this.$data = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PromoCardWrapped$Events promoCardWrapped$Events) {
        PromoCardWrapped$Events promoCardWrapped$Events2 = promoCardWrapped$Events;
        h.e(promoCardWrapped$Events2, "event");
        if (promoCardWrapped$Events2.ordinal() == 0) {
            EncorePromoCardWrappedComponent.Holder.B(this.this$0).a(this.$data);
        }
        return f.a;
    }
}
