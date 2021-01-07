package defpackage;

import com.spotify.http.u;

/* renamed from: wo7  reason: default package */
public final class wo7 implements fjf<vo7> {
    private final wlf<u> a;

    public wo7(wlf<u> wlf) {
        this.a = wlf;
    }

    public static vo7 a(u uVar) {
        vo7 vo7 = (vo7) uVar.c(vo7.class);
        yif.g(vo7, "Cannot return null from a non-@Nullable @Provides method");
        return vo7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
