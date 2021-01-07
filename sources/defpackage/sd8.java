package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: sd8  reason: default package */
public final class sd8 implements fjf<rd8> {
    private final wlf<Fragment> a;

    public sd8(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rd8(this.a.get());
    }
}
