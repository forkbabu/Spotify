package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import kotlin.jvm.internal.h;

/* renamed from: oo9  reason: default package */
public final class oo9 implements fjf<ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration>> {
    private final no9 a;
    private final wlf<EncoreConsumerEntryPoint> b;

    public oo9(no9 no9, wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = no9;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        no9 no9 = this.a;
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.b.get();
        no9.getClass();
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration> searchIntentCardFactory = EncoreConsumerExtensions.searchIntentCardFactory(encoreConsumerEntryPoint.getCards());
        yif.g(searchIntentCardFactory, "Cannot return null from a non-@Nullable @Provides method");
        return searchIntentCardFactory;
    }
}
