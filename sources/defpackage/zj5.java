package defpackage;

import android.os.Bundle;

/* renamed from: zj5  reason: default package */
public final class zj5 implements fjf<String> {
    private final wlf<Bundle> a;

    public zj5(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString("space-id", "");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
