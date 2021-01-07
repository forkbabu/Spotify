package defpackage;

import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

/* renamed from: ssd  reason: default package */
public final class ssd implements fjf<c.a> {
    private final wlf<qsd> a;

    public ssd(wlf<qsd> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        qsd qsd = this.a.get();
        h.e(qsd, "pageLegacyMetadata");
        return c.a.C0301a.a(qsd.e());
    }
}
