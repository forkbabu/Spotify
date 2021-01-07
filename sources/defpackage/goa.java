package defpackage;

import defpackage.foa;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.h;

/* renamed from: goa  reason: default package */
public final class goa implements fjf<eoa> {
    private final wlf<qoa> a;
    private final wlf<ooa> b;

    public goa(wlf<qoa> wlf, wlf<ooa> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        qoa qoa = this.a.get();
        ooa ooa = this.b.get();
        foa.a aVar = foa.a;
        h.e(qoa, "trimmingStep");
        h.e(ooa, "externalLinksParsingStep");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(qoa);
        linkedHashSet.add(ooa);
        return new ioa(linkedHashSet);
    }
}
