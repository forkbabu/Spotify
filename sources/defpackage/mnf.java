package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;
import libs.encore.consumer.components.promo.api.wrapped.PromoCardWrapped$Events;
import libs.encore.consumer.components.promo.api.wrapped.b;

/* renamed from: mnf  reason: default package */
public final class mnf {

    /* renamed from: mnf$a */
    public static final class a implements ComponentFactory<Component<b, PromoCardWrapped$Events>, libs.encore.consumer.components.promo.api.wrapped.a> {
        final /* synthetic */ EncoreConsumerEntryPoint.Cards a;

        a(EncoreConsumerEntryPoint.Cards cards) {
            this.a = cards;
        }

        @Override // com.spotify.encore.ComponentFactory
        public Component<b, PromoCardWrapped$Events> make() {
            return ComponentFactory.DefaultImpls.make(this);
        }

        /* Return type fixed from 'com.spotify.encore.Component' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.encore.ComponentConfiguration] */
        @Override // com.spotify.encore.ComponentFactory
        public Component<b, PromoCardWrapped$Events> make(libs.encore.consumer.components.promo.api.wrapped.a aVar) {
            return new nnf(new onf(this.a.getActivity()));
        }
    }

    public static final ComponentFactory<Component<b, PromoCardWrapped$Events>, libs.encore.consumer.components.promo.api.wrapped.a> a(EncoreConsumerEntryPoint.Cards cards) {
        h.e(cards, "$this$promoCardWrappedFactory");
        return new a(cards);
    }
}
