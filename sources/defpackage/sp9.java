package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.recsplanationsectionheading.RecsplanationSectionHeading;
import com.spotify.encore.consumer.components.home.entrypoint.EncoreConsumerRecsplanationSectionHeadingExtensions;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import kotlin.jvm.internal.h;

/* renamed from: sp9  reason: default package */
public final class sp9 implements fjf<ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public sp9(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        ComponentFactory<Component<RecsplanationSectionHeading.Model, RecsplanationSectionHeading.Events>, RecsplanationSectionHeading.Configuration> recsplanationSectionHeadingFactory = EncoreConsumerRecsplanationSectionHeadingExtensions.recsplanationSectionHeadingFactory(encoreConsumerEntryPoint.getHeadings());
        yif.g(recsplanationSectionHeadingFactory, "Cannot return null from a non-@Nullable @Provides method");
        return recsplanationSectionHeadingFactory;
    }
}
