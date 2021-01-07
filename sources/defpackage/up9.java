package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: up9  reason: default package */
public final class up9 implements fjf<ComponentFactory<Component<SectionHeading2.Model, f>, SectionHeading2.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public up9(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        ComponentFactory<Component<SectionHeading2.Model, f>, SectionHeading2.Configuration> sectionHeading2Factory = EncoreConsumerExtensions.sectionHeading2Factory(encoreConsumerEntryPoint.getHeadings());
        yif.g(sectionHeading2Factory, "Cannot return null from a non-@Nullable @Provides method");
        return sectionHeading2Factory;
    }
}
