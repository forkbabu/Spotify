package defpackage;

import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import kotlin.f;

/* renamed from: lo9  reason: default package */
public final class lo9 implements fjf<ko9> {
    private final wlf<Component<SectionHeading2.Model, f>> a;

    public lo9(wlf<Component<SectionHeading2.Model, f>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ko9(this.a.get());
    }
}
