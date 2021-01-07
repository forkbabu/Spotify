package defpackage;

import android.os.Bundle;

/* renamed from: ga4  reason: default package */
public final class ga4 implements fjf<String> {
    private final wlf<Bundle> a;

    public ga4(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString("view_uri", "");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
