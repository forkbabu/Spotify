package defpackage;

import defpackage.soa;
import defpackage.uoa;
import kotlin.jvm.internal.h;

/* renamed from: voa  reason: default package */
public final class voa implements fjf<soa.a> {
    private final wlf<woa> a;

    public voa(wlf<woa> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        woa woa = this.a.get();
        uoa.a aVar = uoa.a;
        h.e(woa, "urlClickListener");
        return new toa(woa);
    }
}
