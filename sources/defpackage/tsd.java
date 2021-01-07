package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: tsd  reason: default package */
public final class tsd implements fjf<ifd> {
    private final wlf<qsd> a;

    public tsd(wlf<qsd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        qsd qsd = this.a.get();
        h.e(qsd, "pageLegacyMetadata");
        ifd b = qsd.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
