package defpackage;

import android.os.Bundle;

/* renamed from: yj5  reason: default package */
public final class yj5 implements fjf<String> {
    private final wlf<Bundle> a;

    public yj5(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString("redirect_uri", "");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
