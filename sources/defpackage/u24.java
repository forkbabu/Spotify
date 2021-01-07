package defpackage;

import android.os.Bundle;

/* renamed from: u24  reason: default package */
public final class u24 implements fjf<String> {
    private final wlf<Bundle> a;

    public u24(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString("key_ac_search_title");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
