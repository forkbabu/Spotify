package com.spotify.music.homecomponents.wrapped;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import libs.encore.consumer.components.promo.api.wrapped.PromoCardWrapped$Events;
import libs.encore.consumer.components.promo.api.wrapped.b;

public final class a implements fjf<EncorePromoCardWrappedComponent> {
    private final wlf<ComponentFactory<Component<b, PromoCardWrapped$Events>, libs.encore.consumer.components.promo.api.wrapped.a>> a;
    private final wlf<com.spotify.music.homecomponents.promotionv2.encore.b> b;

    public a(wlf<ComponentFactory<Component<b, PromoCardWrapped$Events>, libs.encore.consumer.components.promo.api.wrapped.a>> wlf, wlf<com.spotify.music.homecomponents.promotionv2.encore.b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EncorePromoCardWrappedComponent(this.a.get(), this.b.get());
    }
}
