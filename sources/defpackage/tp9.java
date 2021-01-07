package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading1;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: tp9  reason: default package */
public final class tp9 implements fjf<ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public tp9(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreEntryPoint");
        ComponentFactory<Component<SectionHeading1.Model, f>, SectionHeading1.Configuration> sectionHeading1Factory = EncoreConsumerExtensions.sectionHeading1Factory(encoreConsumerEntryPoint.getHeadings());
        yif.g(sectionHeading1Factory, "Cannot return null from a non-@Nullable @Provides method");
        return sectionHeading1Factory;
    }
}
