package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerExtensions;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: f06  reason: default package */
public final class f06 implements fjf<Component<SectionHeading2.Model, f>> {
    private final wlf<EncoreConsumerEntryPoint> a;

    public f06(wlf<EncoreConsumerEntryPoint> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        h.e(encoreConsumerEntryPoint, "encoreConsumerEntryPoint");
        Component<SectionHeading2.Model, f> make = EncoreConsumerExtensions.sectionHeading2Factory(encoreConsumerEntryPoint.getHeadings()).make();
        yif.g(make, "Cannot return null from a non-@Nullable @Provides method");
        return make;
    }
}
