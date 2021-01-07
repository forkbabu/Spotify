package defpackage;

import com.spotify.http.w;
import okhttp3.y;

/* renamed from: ezc  reason: default package */
public final class ezc implements fjf<y> {
    private final wlf<w> a;

    public ezc(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        y a2 = this.a.get().a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
