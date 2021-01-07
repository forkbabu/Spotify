package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;

/* renamed from: x09  reason: default package */
public final class x09 implements fjf<o> {
    private final wlf<Fragment> a;

    public x09(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        o E2 = this.a.get().E2();
        yif.g(E2, "Cannot return null from a non-@Nullable @Provides method");
        return E2;
    }
}
