package com.spotify.music.homecomponents.promotionv2.encore;

import androidx.lifecycle.n;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class a implements fjf<EncorePromoCardHomeComponent> {
    private final wlf<n> a;
    private final wlf<ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration>> b;
    private final wlf<w50> c;
    private final wlf<g<PlayerState>> d;
    private final wlf<b> e;
    private final wlf<mq9> f;
    private final wlf<y> g;

    public a(wlf<n> wlf, wlf<ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration>> wlf2, wlf<w50> wlf3, wlf<g<PlayerState>> wlf4, wlf<b> wlf5, wlf<mq9> wlf6, wlf<y> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    public static a a(wlf<n> wlf, wlf<ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration>> wlf2, wlf<w50> wlf3, wlf<g<PlayerState>> wlf4, wlf<b> wlf5, wlf<mq9> wlf6, wlf<y> wlf7) {
        return new a(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EncorePromoCardHomeComponent(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
