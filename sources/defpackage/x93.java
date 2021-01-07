package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.t8a;

/* renamed from: x93  reason: default package */
public final class x93 implements fjf<t8a> {
    private final wlf<t8a.a> a;

    public x93(wlf<t8a.a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        t8a a2 = this.a.get().a(ViewUris.a2);
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
