package defpackage;

import android.os.Bundle;

/* renamed from: s88  reason: default package */
public final class s88 implements fjf<ud8> {
    private final wlf<Bundle> a;

    public s88(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    public static ud8 a(Bundle bundle) {
        ud8 ud8 = (ud8) bundle.getParcelable("search_params");
        yif.g(ud8, "Cannot return null from a non-@Nullable @Provides method");
        return ud8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
