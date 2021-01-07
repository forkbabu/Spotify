package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;
import libs.encore.consumer.components.promo.api.wrapped.PromoCardWrapped$Events;
import libs.encore.consumer.components.promo.api.wrapped.a;
import libs.encore.consumer.components.promo.api.wrapped.b;

/* renamed from: ir9  reason: default package */
public final class ir9 implements fjf<ComponentFactory<Component<b, PromoCardWrapped$Events>, a>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public ir9(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        return mnf.a(encoreConsumerEntryPoint.getCards());
    }
}
