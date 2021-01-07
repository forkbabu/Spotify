package defpackage;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;

/* renamed from: j76  reason: default package */
public final class j76 implements fjf<n> {
    private final wlf<Fragment> a;

    public j76(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        n b3 = this.a.get().b3();
        yif.g(b3, "Cannot return null from a non-@Nullable @Provides method");
        return b3;
    }
}
