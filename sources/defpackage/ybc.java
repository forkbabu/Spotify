package defpackage;

import com.spotify.music.connection.n;
import io.reactivex.s;

/* renamed from: ybc  reason: default package */
public final class ybc implements fjf<s<Boolean>> {
    private final wlf<n> a;

    public ybc(wlf<n> wlf) {
        this.a = wlf;
    }

    public static s<Boolean> a(n nVar) {
        s<Boolean> b = nVar.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
