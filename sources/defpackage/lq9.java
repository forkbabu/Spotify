package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.spotify.encore.consumer.components.promo.entrypoint.EncoreConsumerPromoCardHomeExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

/* renamed from: lq9  reason: default package */
public final class lq9 implements fjf<ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public lq9(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreConsumerEntryPoint");
        ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration> promoCardHomeFactory = EncoreConsumerPromoCardHomeExtensions.promoCardHomeFactory(encoreConsumerEntryPoint.getCards());
        yif.g(promoCardHomeFactory, "Cannot return null from a non-@Nullable @Provides method");
        return promoCardHomeFactory;
    }
}
