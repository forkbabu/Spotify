package defpackage;

import android.os.Bundle;

/* renamed from: w88  reason: default package */
public final class w88 implements fjf<wd8> {
    private final wlf<Bundle> a;

    public w88(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    public static wd8 a(Bundle bundle) {
        wd8 wd8 = (wd8) bundle.getParcelable("search_params");
        yif.g(wd8, "Cannot return null from a non-@Nullable @Provides method");
        return wd8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
