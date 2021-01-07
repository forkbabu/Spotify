package defpackage;

import com.spotify.mobile.android.util.connectivity.b0;
import io.reactivex.s;

/* renamed from: vbc  reason: default package */
public final class vbc implements fjf<s<Boolean>> {
    private final wlf<b0> a;

    public vbc(wlf<b0> wlf) {
        this.a = wlf;
    }

    public static s<Boolean> a(b0 b0Var) {
        s<Boolean> b = b0Var.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
