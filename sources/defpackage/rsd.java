package defpackage;

import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

/* renamed from: rsd  reason: default package */
public final class rsd implements fjf<c> {
    private final wlf<qsd> a;

    public rsd(wlf<qsd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        qsd qsd = this.a.get();
        h.e(qsd, "pageLegacyMetadata");
        c e = qsd.e();
        yif.g(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
